package net.thexcoders.data_structures.hash_tables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {
    HashTableImpl table = new HashTableImpl();

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
    void testTable() {
        assertEquals("Hello",table.get("Greetings"));
    }

    @Test
    void testCollision(){
        assertTrue(table.addToTable("ab", "Message 1"));
        assertFalse(table.addToTable("ba", "Message 2"));
        assertTrue(table.contains("ba"));
        assertTrue(table.contains("ba","Message 1"));
        assertFalse(table.contains("ba","Message 2"));
    }

    @Test
    void testInsert(){
        assertTrue(table.addToTable("ab", "Message 1"));
        assertFalse(table.addToTable("ba", "Message 2"));
    }
}