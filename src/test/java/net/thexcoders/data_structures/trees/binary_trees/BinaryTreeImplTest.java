package net.thexcoders.data_structures.trees.binary_trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeImplTest {
    BinaryTreeImpl tree = new BinaryTreeImpl(7);



    @BeforeEach
    void setUp() {
        tree.insert(2);
        tree.insert(8);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
    }

    @AfterEach
    void tearDown() {
        tree = new BinaryTreeImpl(7);
    }


    @Test
    void testSearch(){
        assertTrue(tree.search(7));
        assertTrue(tree.search(2));
        assertTrue(tree.search(1));
        assertFalse(tree.search(-1));
        assertFalse(tree.search(10));
    }


    @Test
    void testInsert(){
        assertTrue(tree.insert(14));
        assertTrue(tree.search(14));
        assertTrue(tree.insert(-1));
        assertTrue(tree.search(-1));
        assertTrue(tree.insert(55));
        assertTrue(tree.search(55));
        assertTrue(tree.insert(4));
        assertTrue(tree.search(4));
        assertFalse(tree.insert(1));
        assertFalse(tree.insert(7));
    }

}