import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;
    @Before
    public void setUp() throws Exception {
        stringCount = new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCount = null;
    }

    @Test
    public void testStringCountMethodSuccess() {
        String[] input = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedValue = new HashMap<String,Boolean>();
        expectedValue.put("a",true);
        expectedValue.put("b",false);
        expectedValue.put("c",true);
        expectedValue.put("d",false);
        assertEquals(expectedValue,stringCount.stringCountMethod(input));
    }

    @Test
    public void testStringCountMethodFailure() {
        String[] input = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedValue = new HashMap<String,Boolean>();
        expectedValue.put("a",true);
        expectedValue.put("b",false);
        expectedValue.put("c",true);

        assertNotEquals(expectedValue,stringCount.stringCountMethod(input));
    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(stringCount.stringCountMethod(null));
    }
}