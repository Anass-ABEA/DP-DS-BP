package net.thexcoders.data_structures.fifo_stack;

import java.util.LinkedList;

public class FifoImproved<E> extends LinkedList<E> {
    private int maxSize;

    public FifoImproved(int maxSize) {
        this.maxSize = maxSize;
    }


    // use the defined add function and call the add of the super when the size isn't exceeded.
    @Override
    public boolean add(E e) {
        if(this.size()>= maxSize) return false;
        super.add(e);
        return true;
    }




}
