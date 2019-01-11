package com.stackroute.p5;

import com.stackroute.p5.Maintest;
import com.stackroute.p5.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MaintestTest {
    Maintest maintest;
    @Before
    public void setUp() throws Exception {
        maintest = new Maintest();
    }

    @After
    public void tearDown() throws Exception {
        maintest = null;
    }

    @Test
    public void testSortSuccess() {
        ArrayList<StudentSorter> studentSorters = new ArrayList<>();
        studentSorters.add(new StudentSorter(151, "aaaa", 11));
        studentSorters.add(new StudentSorter(161, "cccc", 44));
        studentSorters.add(new StudentSorter(131, "aaaa", 11));
        studentSorters.add(new StudentSorter(121, "cccc", 55));
        studentSorters.add(new StudentSorter(111, "bbbb", 22));
        studentSorters.add(new StudentSorter(141, "bbcd", 22));
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(121, "cccc", 55));
        expectedValue.add(new Student(161, "cccc", 44));
        expectedValue.add(new Student(111, "bbbb", 22));
        expectedValue.add(new Student(141, "bbcd", 22));
        expectedValue.add(new Student(151, "aaaa", 11));
        expectedValue.add(new Student(131, "aaaa", 11));

        //Assert
        assertEquals(expectedValue.toString(),maintest.sorting(studentSorters).toString());
    }

    @Test
    public void testSortFailure() {
        ArrayList<StudentSorter> studentSorters = new ArrayList<>();
        studentSorters.add(new StudentSorter(151, "aaaa", 11));
        studentSorters.add(new StudentSorter(161, "cccc", 44));
        studentSorters.add(new StudentSorter(131, "aaaa", 11));
        studentSorters.add(new StudentSorter(121, "cccc", 55));
        studentSorters.add(new StudentSorter(111, "bbbb", 22));

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(121, "cccc", 55));
        expectedValue.add(new Student(161, "cccc", 44));
        expectedValue.add(new Student(111, "bbbb", 22));
        expectedValue.add(new Student(141, "bbcd", 22));
        expectedValue.add(new Student(151, "aaaa", 11));
        expectedValue.add(new Student(131, "aaaa", 11));

        //Assert
        assertNotEquals(expectedValue.toString(),maintest.sorting(studentSorters).toString());
    }

    @Test(expected = NullPointerException.class)
    public void testInvalid() {
        assertNotNull(maintest.sorting(null).toString());
    }
}