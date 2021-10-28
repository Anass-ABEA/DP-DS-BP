package net.thexcoders.data_structures.linked_lists;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListImplTest {
    DoubleLinkedListImpl linkedList = new DoubleLinkedListImpl(0);
    @BeforeEach
    void setUp() {
        DoubleLinkedListImpl tempList = linkedList;
        DoubleLinkedListImpl tempListBefore = null;
        for (int i = 1; i < 10; i++) {
            tempList.next = new DoubleLinkedListImpl(i);
            tempList.previous = tempListBefore;
            tempListBefore = tempList;
            tempList = tempList.next;
        }
        tempList.previous = tempListBefore;
    }

    @AfterEach
    void tearDown() {
        linkedList = new DoubleLinkedListImpl(0);
    }

    @Test
    void testItemsCorrect() {
        DoubleLinkedListImpl tempList = linkedList;
        for (int i = 0; i < 10; i++) {
            assertEquals(i, tempList.value);
            tempList = tempList.next;
        }
    }

    @Test
    void testLastItem() {
        assertEquals(9, linkedList.lastElement().value);
    }

    @Test
    void testSize() {
        assertEquals(10, linkedList.size());
    }

    @Test
    void testRemoveFirst(){
        linkedList = linkedList.remove(0);
        assertEquals(9,linkedList.size());
        assertEquals(1,linkedList.value);
        assertEquals(9,linkedList.lastElement().value);
    }

    @Test
    void testRemoveMiddle(){
        linkedList = linkedList.remove(6);
        assertEquals(9,linkedList.size());
        assertEquals(0,linkedList.value);
        assertEquals(5,linkedList.valueAt(5));
        assertEquals(7,linkedList.valueAt(6));
        assertEquals(9,linkedList.lastElement().value);
    }

    @Test
    void testRemoveLast(){
        linkedList = linkedList.remove(9);
        assertEquals(9,linkedList.size());
        assertEquals(0,linkedList.value);
        assertEquals(8,linkedList.lastElement().value);
    }




    @Test
    void testInsertFirst(){
        linkedList = linkedList.insert(0,-5);
        assertEquals(11,linkedList.size());
        assertEquals(-5,linkedList.value);
        assertEquals(0,linkedList.valueAt(1));
        assertEquals(9,linkedList.valueAt(10));
    }

    @Test
    void testInsertMiddle(){
        linkedList = linkedList.insert(3,-5);
        assertEquals(11,linkedList.size());
        assertEquals(0,linkedList.value);
        assertEquals(2,linkedList.valueAt(2));
        assertEquals(-5,linkedList.valueAt(3));
        assertEquals(3,linkedList.valueAt(4));
        assertEquals(9,linkedList.lastElement().value);
    }

    @Test
    void testInsertLast(){
        linkedList = linkedList.insert(linkedList.size(), -5);
        assertEquals(11,linkedList.size());
        assertEquals(0,linkedList.value);
        assertEquals(9,linkedList.valueAt(9));
        assertEquals(-5,linkedList.lastElement().value);
    }




    @Test
    void testUpdateFirst(){
        linkedList.update(0,-5);
        assertEquals(10,linkedList.size());
        assertEquals(-5,linkedList.value);
        assertEquals(1,linkedList.valueAt(1));
        assertEquals(9,linkedList.valueAt(9));
    }

    @Test
    void testUpdateMiddle(){
        linkedList.update(5,-5);
        assertEquals(10,linkedList.size());
        assertEquals(0,linkedList.value);
        assertEquals(4,linkedList.valueAt(4));
        assertEquals(-5,linkedList.valueAt(5));
        assertEquals(6,linkedList.valueAt(6));
    }

    @Test
    void testUpdateLast(){
        linkedList.update(9,-5);
        assertEquals(10,linkedList.size());
        assertEquals(0,linkedList.value);
        assertEquals(8,linkedList.valueAt(8));
        assertEquals(-5,linkedList.valueAt(9));
    }

    @Test
    void testSearchInList(){
        assertTrue(linkedList.contains(0));
        assertTrue(linkedList.contains(3));
        assertTrue(linkedList.contains(5));
        assertFalse(linkedList.contains(11));
    }

}