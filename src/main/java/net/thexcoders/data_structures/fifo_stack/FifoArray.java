package net.thexcoders.data_structures.fifo_stack;

public class FifoArray {
    protected Integer[] stack;
    protected int topIndex;

    public FifoArray(int stackSize) {
        this.stack = new Integer[stackSize]; // array of null values
        topIndex = 0;
    }


    // add the element at the top Position that refers to the head of the stack and increment the topValue
    public boolean push(int val) {
        if (topIndex >= stack.length) return false;
        stack[topIndex++] = val;
        return true;
    }


    // remove the element at the top position and decrement the value
    public int pop() throws FifoException {
        if (topIndex == 0) throw new FifoException("Empty Stack! there is nothing to pop");
        return stack[topIndex--];
    }

    public void emptyStack(){
        this.topIndex = 0;
        this.stack = new Integer[stack.length]; // can be dropped!
        // the index is what matters in this case!
    }

    public static class FifoException extends Exception{
        public FifoException(String message){
            super(message);
        }
    }
}
