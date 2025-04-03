package com.bridgelabz.junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        Assertions.assertTrue(list.contains(5), "Element was not added correctly");
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.remove(Integer.valueOf(10));
        Assertions.assertFalse(list.contains(10), "Element is still present in the list");
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 1);
        ListManager.addElement(list, 2);
        Assertions.assertEquals(2, ListManager.getSize(list), "List size is incorrect after additions");

        ListManager.removeElement(list, 1);
        Assertions.assertEquals(1, ListManager.getSize(list), "List size is incorrect after removal");
    }
}

