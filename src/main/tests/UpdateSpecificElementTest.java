import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificElementTest {
    UpdateSpecificElement updateSpecificElement;
    @Before
    public void setUp() throws Exception {
        updateSpecificElement = new UpdateSpecificElement();
    }

    @After
    public void tearDown() throws Exception {
        updateSpecificElement = null;
    }

    @Test
    public void testUpdateElementSuccess() {

            //UpdateSpecifcElement obj = new UpdateSpecifcElement();
            List<String> input = new ArrayList<>();
            input.add("Apple");
            input.add("Grape");
            input.add("Melon");
            input.add("Berry");
            List<String> expectedValue = new ArrayList<>();
            expectedValue.add("Kiwi");
            expectedValue.add("Grape");
            expectedValue.add("Mango");
            expectedValue.add("Berry");
            assertEquals(expectedValue,updateSpecificElement.updateElement(input,"Apple","Melon"));
    }

    @Test
    public void testUpdateElementFailure() {

        List<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        input.add("apple");
        List<String> expectedValue = new ArrayList<>();
        expectedValue.add("Kiwi");
        expectedValue.add("Grape");
        expectedValue.add("Mango");
        expectedValue.add("Berry");
        assertNotEquals(expectedValue,updateSpecificElement.updateElement(input,"Apple","Melon"));
    }

    @Test
    public void testEmptyListSuccess() {
        List<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        input.add("apple");
        List<String> expectedValue = new ArrayList<>();
        assertEquals(expectedValue,updateSpecificElement.emptyList(input));
    }
    @Test
    public void testEmptyListFailure() {
        List<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        input.add("apple");
        assertNotNull(updateSpecificElement.emptyList(input));
    }
}