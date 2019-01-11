package com.stackroute.p5;

import com.stackroute.p5.NameSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NameSortTest {
    NameSort nameSort;
    @Before
    public void setUp() throws Exception {
        nameSort = new NameSort();
    }

    @After
    public void tearDown() throws Exception {
        nameSort = null;
    }

    @Test
    public void testNameSortMethodSuccess() {
        String[] input = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedValue = new ArrayList<>();
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        assertEquals(expectedValue,nameSort.nameSortMethod(input));
    }

    @Test
    public void testNameSortMethodFailure() {
        String[] input = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedValue = new ArrayList<>();
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");

        assertNotEquals(expectedValue,nameSort.nameSortMethod(input));
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {

        assertNull(nameSort.nameSortMethod(null));
    }
}