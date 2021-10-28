package net.thexcoders.data_structures.fifo_stack;

import java.util.ArrayList;

public class FIFO {
    private ArrayList<Integer> stack = new ArrayList<>();
    private final int maxSize;

    public FIFO(int maxSize) {
        this.maxSize = maxSize;
    }

    // add the element at the last position
    public boolean push(int i) {
        if (stack.size() + 1 > maxSize) return false;
        stack.add(i);
        return true;
    }

    // remove the element at the first position
    public int pop() {
        return stack.remove(0);
    }


    // clear the stack
    public void clearStack() {
        stack = new ArrayList<>();
    }

    public int size() {
        return stack.size();
    }
}
