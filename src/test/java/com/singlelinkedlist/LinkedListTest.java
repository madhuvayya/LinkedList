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
    public void givenInput_IfFound_ReturnTrue() throws Exception {
        Assert.assertTrue(linkedList.searchWord("a"));
    }

    @Test
    public void givenIntegerInput_IfFound_ReturnTrue() throws Exception {
        Assert.assertTrue(linkedList.searchWord( "1"));
    }

    @Test
    public void invokedlistmethod_ShouldReturnTrue_IfEmptyListIsCreated() throws Exception {
        linkedList.list();
        int size = linkedList.size();
        Assert.assertEquals(0,size);
    }

    @Test
    public void invokedAddMethod_WhenNotInTheFile_ShouldAddedItemList() throws Exception {
        linkedList.list();
        linkedList.add("25");
        linkedList.add("bat");
        linkedList.add("v");
        int size = linkedList.size();
        Assert.assertEquals(3,size);
    }
}
