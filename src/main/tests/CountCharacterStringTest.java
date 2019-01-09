import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class CountCharacterStringTest {

    CountCharacterString object;
    /*Class object setup, performs before entering a test case
     */

    @Before
    public void setUp() {
        object = new CountCharacterString();
    }

    /*Class object teardown, performs after entering a test case
     */

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testCountCharacterMethodSuccess() {
        assertEquals(2,object.countCharacterMethod("Hello world","o"));
    }

    @Test
    public void testCountCharacterMethodFailure() {
        assertNotEquals(2,object.countCharacterMethod("Hello World","0"));
    }

    @Test
    public void testCountCharacterMethodNeutral() {
        assertNotNull(object.countCharacterMethod("Hello World","l"));
    }

}