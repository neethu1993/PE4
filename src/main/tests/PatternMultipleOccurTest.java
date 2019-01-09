import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PatternMultipleOccurTest {
    PatternMultipleOccur patternMultipleOccur;
    @Before
    public void setUp() throws Exception {
        patternMultipleOccur = new PatternMultipleOccur();
    }

    @After
    public void tearDown() throws Exception {
        patternMultipleOccur = null;
    }

    @Test
    public void testPatternmultipleOccurMethodSuccess() {
        List<String> expected = new ArrayList<>();
        expected.add("Found at: 4 - 6");
        expected.add("Found at: 10 - 12");
        expected.add("Found at: 27 - 29");
        assertEquals(expected,patternMultipleOccur.patternmultipleOccurMethod("She sells seashells by the seashore"));
    }

    @Test
    public void testPatternmultipleOccurMethodFailure() {
        List<String> expected = new ArrayList<>();
        expected.add("Found at: 4 - 6");
        expected.add("Found at: 10 - 12");
        expected.add("Found at: 27 - 28");
        assertNotEquals(expected,patternMultipleOccur.patternmultipleOccurMethod("She sells seashells by the seashore"));
    }

    @Test
    public void testPatternmultipleOccurMethodNeutral() {

        assertNull(patternMultipleOccur.patternmultipleOccurMethod("She is sweet"));
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidValue()
    {
        assertNull(patternMultipleOccur.patternmultipleOccurMethod(null));

    }
}