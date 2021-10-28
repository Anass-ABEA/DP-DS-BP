package net.thexcoders.data_structures.fifo_stack;

import java.util.ArrayList;

public class LIFO {
    private ArrayList<Integer> stack = new ArrayList<>();
    private final int maxSize;

    public LIFO(int maxSize) {
        this.maxSize = maxSize;
    }


    // add the element at the end of the list
    public boolean push(int i){
        if (stack.size() + 1 > maxSize) return false;
        stack.add(i);
        return true;
    }


    // remove the element from the end of the list
    public int pop(){
        return stack.remove(stack.size() -1);
    }

    public void clearStack() {
        stack = new ArrayList<>();
    }

    public int size(){
        return stack.size();
    }
}
