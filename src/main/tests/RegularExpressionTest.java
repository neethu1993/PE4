import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression regularExpression;
    @Before
    public void setUp() throws Exception {
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown() throws Exception {
        regularExpression = null;
    }

    @Test
    public void testRegularExpressionMethodSuccess() {
        assertEquals(true,regularExpression.regularExpressionMethod("This is Harry."));
    }

    @Test
    public void testRegularExpressionMethodFailure() {
        assertEquals(false,regularExpression.regularExpressionMethod("This is Henry."));
    }

    @Test
    public void testRegularExpressionMethodNeutral() {
        assertNotNull(regularExpression.regularExpressionMethod("Hai Harry"));
    }
}