package com.stackroute.p4;

import com.stackroute.p4.MultipleCharacterReplace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleCharacterReplaceTest {
    MultipleCharacterReplace object;
    @Before
    public void setUp() throws Exception {
        object = new MultipleCharacterReplace();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testMultipleCharacterReplaceMethodSuccess() {
        String expectedValue = "faity fry";
        assertEquals(expectedValue,object.multipleCharacterReplaceMethod("daily dry"));
    }

    @Test
    public void testMultipleCharacterReplaceMethodFailure() {
        String expectedValue = "daily dry";
        assertNotEquals(expectedValue,object.multipleCharacterReplaceMethod("daily dry"));
    }

}