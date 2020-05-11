package com.singlelinkedlist;

import org.junit.Assert;
import org.junit.Test;


public class LinkedListTest {
    private LinkedList linkedList = new LinkedList();

    @Test
    public void givenInput_IfFound_ReturnTure() throws Exception {
        Assert.assertEquals(true,linkedList.searchWord("apple"));
    }

    @Test
    public void givenInput_IfNotFound_ReturnFalse() throws Exception {
        Assert.assertFalse(linkedList.searchWord("e"));
    }

    @Test
    public void givenIntegerInput_IfFound_ReturnTrue() throws Exception {
        Assert.assertTrue(linkedList.searchWord("a"));
    }
}
