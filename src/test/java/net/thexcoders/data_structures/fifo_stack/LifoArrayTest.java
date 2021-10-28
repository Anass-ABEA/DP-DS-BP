package net.thexcoders.data_structures.fifo_stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifoArrayTest {
    LifoArray fifo = new LifoArray(10);

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 6; i++) {
            fifo.push(i);
        }
    }

    @AfterEach
    void tearDown() {
        fifo.emptyStack();
    }

    @Test
    void testPush() {
        assertTrue(fifo.push(6));
        assertTrue(fifo.push(7));
        assertTrue(fifo.push(8));
        assertTrue(fifo.push(9));
        assertFalse(fifo.push(10));
    }

    @Test
    void testPopSafe() throws LifoArray.LifoException {
        for (int i = 0; i < 5; i--) {
            assertEquals(i, fifo.pop());
        }
    }

    @Test
    void testPopUnsafeException() {
        try {
            fifo.emptyStack();
            fifo.pop();
            fail("SHOULD HAVE RETURNED AN EXCEPTION");
        } catch (LifoArray.LifoException e) {
            assertTrue(true);
        }
    }

}