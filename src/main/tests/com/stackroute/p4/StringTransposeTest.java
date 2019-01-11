package com.stackroute.p4;

import com.stackroute.p4.StringTranspose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose object;
    @Before
    public void setUp() throws Exception {
        object = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testStringTransposeMethodSuccess() {
        String expectedValue = "a kciuq nworb xof spmuj revo eht yzal god";
        String actualValue = object.stringTransposeMethod("a quick brown fox jumps over the lazy dog");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testStringTransposeMethodFailure() {
        String expectedValue = "a kciuq nworb xof spmuj revo eht yzal god";
        String actualValue = object.stringTransposeMethod("a quick brown fox jumps over the lazy dog1");
        assertNotEquals(expectedValue,actualValue);
    }
}