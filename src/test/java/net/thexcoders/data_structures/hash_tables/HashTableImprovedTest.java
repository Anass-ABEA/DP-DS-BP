package net.thexcoders.data_structures.hash_tables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableImprovedTest {
    HashTableImproved table = new HashTableImproved();

    @BeforeEach
    void setUp() {
        table.addToTable("Greetings","Hello");
        table.addToTable("test","Test");
        table.addToTable("Website","The X Coders");
    }

    @AfterEach
    void tearDown() {
        table.clearTable();
    }

    @Test
    void testDisplayList(){
        table.addToTable("ab", "Message 1");
        table.addToTable("ba", "Message 2");
        table.addToTable("ab", "Message 3");
        System.err.println(table.get("ab"));
        System.err.println(table.get("ba"));
    }

    @Test
    void testCollision(){
        table.addToTable("ab", "Message 1");
        table.addToTable("ba", "Message 2");
        assertTrue(table.contains("ba"));
        assertTrue(table.contains("ba","Message 1"));
        assertTrue(table.contains("ab","Message 2"));
    }
}