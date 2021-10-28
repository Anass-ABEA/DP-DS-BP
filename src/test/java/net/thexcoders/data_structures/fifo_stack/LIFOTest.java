package net.thexcoders.data_structures.fifo_stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LIFOTest {
     LIFO fifo = new LIFO(11);

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
        assertEquals(15,fifo.pop());
        assertEquals(9,fifo.pop());
    }

    @Test
    void pop() {
        assertEquals(9,fifo.pop());
        assertEquals(8,fifo.pop());
        assertEquals(7,fifo.pop());
    }
}