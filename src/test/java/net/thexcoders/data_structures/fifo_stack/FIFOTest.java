package net.thexcoders.data_structures.fifo_stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIFOTest {
     FIFO fifo = new FIFO(11);

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 10; i++) {
            fifo.push(i);
        }
    }

    @AfterEach
    void tearDown() {
        fifo.clearStack();
    }

    @Test
    void size(){
        assertEquals(10,fifo.size());
    }

    @Test
    void push() {
        fifo.push(15);
        assertEquals(11,fifo.size());
        assertEquals(0,fifo.pop());
    }

    @Test
    void pop() {
        assertEquals(0,fifo.pop());
        assertEquals(1,fifo.pop());
        assertEquals(2,fifo.pop());
    }
}