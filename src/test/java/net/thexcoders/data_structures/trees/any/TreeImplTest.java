package net.thexcoders.data_structures.trees.any;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TreeImplTest {
    TreeImpl tree = new TreeImpl(5);

    @BeforeEach
    void setUp() {
        TreeImpl treeC = new TreeImpl(-5);
        ArrayList<TreeImpl> list = new ArrayList<>();
        list.add(new TreeImpl(6));
        list.add(new TreeImpl(10));
        list.add(new TreeImpl(9));
        treeC.children = list;

        list = new ArrayList<>();
        list.add(treeC);
        list.add(new TreeImpl(-10));
        list.add(new TreeImpl(-9));
        tree.children = list;
    }

    @AfterEach
    void tearDown() {
        TreeImpl tree = new TreeImpl(5);
    }

    @Test
    void testBFS(){
        tree.BFS_Print();
    }

    @Test
    void testBFSDown(){
        tree.BFS_Print_Down();
    }

    @Test
    void testDFS(){
        tree.DFS_Print();
    }

    @Test
    void testDepth(){
        assertEquals(3,tree.depth());
    }

}