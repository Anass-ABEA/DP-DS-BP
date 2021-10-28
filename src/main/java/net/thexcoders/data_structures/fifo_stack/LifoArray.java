package net.thexcoders.data_structures.fifo_stack;


// TODO : fill the class and add a test Class.
public class LifoArray {
    protected Integer[] stack;


    public LifoArray(int stackSize) {
        this.stack = new Integer[stackSize ]; // array of null values
    }


    public boolean push(int val) {
        return false;
    }

    public Integer pop() throws LifoException {
       return -1;
    }

    public void emptyStack() {
        this.stack = new Integer[stack.length]; // can be dropped!
        // the index is what matters in this case!
    }

    public static class LifoException extends Exception {
        public LifoException(String message) {
            super(message);
        }
    }
}
