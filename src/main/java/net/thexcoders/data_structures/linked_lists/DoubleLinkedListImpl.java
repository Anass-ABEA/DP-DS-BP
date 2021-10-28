package net.thexcoders.data_structures.linked_lists;

public class DoubleLinkedListImpl implements DoubleLinkedList  {

    protected int value;
    protected DoubleLinkedListImpl next;
    protected DoubleLinkedListImpl previous;

    public DoubleLinkedListImpl(int value){
        this.value = value;
    }

    public int size(){
        if(next == null) return 1;
        return 1+ next.size();
    }

    public DoubleLinkedListImpl lastElement() {
        if(next == null) return this;
        return next.lastElement();
    }


    // update the element at the given index
    public boolean update(int index, int value){
        if(index == 0){
            this.value = value;
            return true;
        }
        return next.update(index-1, value);
    }

    // insert a value at a given index
    public DoubleLinkedListImpl insert(int index, int value){
        DoubleLinkedListImpl res = new DoubleLinkedListImpl(value);
        if(index == 0){
            res.next = this;
            this.previous = res;
            return res;
        }
        if(index == size()){
            DoubleLinkedListImpl tempDouble = lastElement();
            tempDouble.next = res;
            res.previous = tempDouble;
            return this;
        }
        int tempIndex = 0;
        DoubleLinkedListImpl tempDoubleLinked = this;
        while(tempIndex != index){
            tempIndex++;
            tempDoubleLinked = tempDoubleLinked.next;
        }
        res.next = tempDoubleLinked;
        res.previous =tempDoubleLinked.previous;
        tempDoubleLinked.previous.next = res;
        tempDoubleLinked.previous = res;
        return this;
    }

    // remove the element at the given index;
    public DoubleLinkedListImpl remove(int index){
        if(index == 0){
            next.previous = null;
            return next;
        }
        int tempIndex = 0;
        DoubleLinkedListImpl tempDoubleList = this;
        while (index != tempIndex+1 ){
            tempIndex++;
            tempDoubleList = tempDoubleList.next;
        }
        if(tempDoubleList.next.next == null){
            tempDoubleList.next = null;
        }else{
            tempDoubleList.next.next.previous = tempDoubleList;
            tempDoubleList.next = tempDoubleList.next.next;
        }
        return this;
    }

    // get the value of the element at the given index
    public int valueAt(int index) {
        if (index == 0) return value;
        return next.valueAt(index-1);
    }

    @Override
    public String toString() {
        return "[ Before: "+ (previous==null? "null":previous.value) + ", "+value+" , After: "+(next==null? "null":next.value)+" ]\n";
    }

    public void showAll(){
        System.err.println(this);
        if (next == null){
        }else{
            next.showAll();
        }
    }

    // check if the list contains a specific value
    public boolean contains(int value){
        if (next == null) return false;
        if (this.value == value) return true;
        return next.contains(value);
    }
}
