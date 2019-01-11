package com.stackroute.p4;

import com.stackroute.p4.SortWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords object;
    @Before
    public void setUp() throws Exception {
        object = new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testWordSortMethodSuccess() {
        String expectedValue = "is my name neethu";
        String actualValue = object.wordSortMethod("my name is neethu");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testWordSortMethodFailure() {
        String expectedValue = "is my name neethu";
        String actualValue = object.wordSortMethod("my name is neethu .");
        assertNotEquals(expectedValue,actualValue);
    }
}