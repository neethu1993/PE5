package com.stackroute.p5;

import com.stackroute.p5.TwoKeyValuePairs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TwoKeyValuePairsTest {
    TwoKeyValuePairs twoKeyValuePairs;
    @Before
    public void setUp() throws Exception {
        twoKeyValuePairs = new TwoKeyValuePairs();
    }

    @After
    public void tearDown() throws Exception {
        twoKeyValuePairs = null;
    }

    @Test
    public void testTwoKeyValueMethodSuccess() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "java");
        assertEquals(expectedValue,twoKeyValuePairs.twoKeyValueMethod(input));

    }

    @Test
    public void testTwoKeyValueMethodFailure() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "c++");
        assertNotEquals(expectedValue,twoKeyValuePairs.twoKeyValueMethod(input));

    }
    @Test
    public void testTwoKeyValueMethodNeutral() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", " ");
        input.put("val2", " ");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", " ");
        assertEquals(expectedValue,twoKeyValuePairs.twoKeyValueMethod(input));

    }
    @Test(expected = NullPointerException.class)
    public void invalidTest() {
        assertNull(twoKeyValuePairs.twoKeyValueMethod(null));
    }
}