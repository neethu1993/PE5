import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {
    WordCount wordCount;
    @Before
    public void setUp() throws Exception {
        wordCount = new WordCount();
    }

    @After
    public void tearDown() throws Exception {
        wordCount = null;
    }

    @Test
    public void testWordCountSuccess() {
        Map<String,Integer> expectedValue = new HashMap<String,Integer>();
        expectedValue.put("one",5);
        expectedValue.put("two",2);
        expectedValue.put("three",2);
        assertEquals(expectedValue,wordCount.wordCount("one one -one___two,,three,one @three*one?two"));
    }

    @Test
    public void testWordCountFailure() {

        assertNotNull(wordCount.wordCount("123!@$&*)^$!abc#$# see"));
    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordCount.wordCount(null));
    }
}