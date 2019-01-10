import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        Student[] s = new Student[6];
        s[0] = new Student(151, "aaaa", 11);
        s[1]= new Student(161, "cccc", 44);
        s[2] = new Student(131, "aaaa", 11);
        s[3] = new Student(121, "cccc", 55);
        s[4] = new Student(111, "bbbb", 22);
        s[5] = new Student(141, "bbcd", 22);
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(121, "cccc", 55));
        expectedValue.add(new Student(161, "cccc", 44));
        expectedValue.add(new Student(111, "bbbb", 22));
        expectedValue.add(new Student(141, "bbcd", 22));
        expectedValue.add(new Student(131, "aaaa", 11));
        expectedValue.add(new Student(151, "aaaa", 11));

        assertEquals(expectedValue.toString(),maintest.sort(s,6).toString());
    }

    @Test
    public void testSortFailure() {
        Student[] s = new Student[6];
        s[0] = new Student(151, "aaaa", 11);
        s[1]= new Student(161, "cccc", 44);
        s[2] = new Student(131, "aaaa", 11);
        s[3] = new Student(121, "cccc", 55);
        s[4] = new Student(111, "bbbb", 22);
        s[5] = new Student(141, "bbcd", 22);
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(121, "cccc", 55));
        expectedValue.add(new Student(161, "cccc", 44));
        expectedValue.add(new Student(111, "bbbb", 22));
        expectedValue.add(new Student(141, "bbcd", 22));
        expectedValue.add(new Student(131, "aaaa", 11));
        expectedValue.add(new Student(15, "aaaa", 11));

        assertNotEquals(expectedValue.toString(),maintest.sort(s,6).toString());
    }
}