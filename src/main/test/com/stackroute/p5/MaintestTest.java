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
        Student[] students = new Student[6];
        students[0] = new Student(151, "aaaa", 11);
        students[1]= new Student(161, "cccc", 44);
        students[2] = new Student(131, "aaaa", 11);
        students[3] = new Student(121, "cccc", 55);
        students[4] = new Student(111, "bbbb", 22);
        students[5] = new Student(141, "bbcd", 22);
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(121, "cccc", 55));
        expectedValue.add(new Student(161, "cccc", 44));
        expectedValue.add(new Student(111, "bbbb", 22));
        expectedValue.add(new Student(141, "bbcd", 22));
        expectedValue.add(new Student(131, "aaaa", 11));
        expectedValue.add(new Student(151, "aaaa", 11));

        //Assert
        assertEquals(expectedValue.toString(),maintest.sort(students,6).toString());
    }

    @Test
    public void testSortFailure() {
        Student[] students = new Student[6];
        students[0] = new Student(151, "aaaa", 11);
        students[1]= new Student(161, "cccc", 44);
        students[2] = new Student(131, "aaaa", 11);
        students[3] = new Student(121, "cccc", 55);
        students[4] = new Student(111, "bbbb", 22);
        students[5] = new Student(141, "bbcd", 22);
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(121, "cccc", 55));
        expectedValue.add(new Student(161, "cccc", 44));
        expectedValue.add(new Student(111, "bbbb", 22));
        expectedValue.add(new Student(141, "bbcd", 22));
        expectedValue.add(new Student(131, "aaaa", 11));
        expectedValue.add(new Student(15, "aaaa", 11));

        //Assert
        assertNotEquals(expectedValue.toString(),maintest.sort(students,6).toString());
    }

    @Test(expected = NullPointerException.class)
    public void testInvalid() {
        assertNotNull(maintest.sort(null,6).toString());
    }
}