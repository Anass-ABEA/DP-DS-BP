package net.thexcoders.data_structures.linked_lists;

public class LinkedListImpl implements LinkedList {

    protected int value;
    protected LinkedListImpl next;

    public LinkedListImpl(int val){
        this.value = val;
    }

    public int size(){
        if(next == null) return 1;
        return 1 + next.size();
    }

    public LinkedListImpl lastElement(){
        if(next == null) return  this;
        return next.lastElement();
    }

    public int valueAt(int index){
        if(index>size()) return -1;
        if(index == 0) return value;
        return next.valueAt(index-1);
    }

    public LinkedListImpl remove(int index){
        if(index>size()) return this;

        if (index == 0) return next;

        int tempIndex = 0;
        LinkedListImpl tempLinkedList = this;

        while (index!= tempIndex+1){
            tempLinkedList = tempLinkedList.next;
            tempIndex++;
        }

        if(tempLinkedList.next.next == null){
            tempLinkedList.next =null;
        }else{
            tempLinkedList.next = tempLinkedList.next.next;
        }

        return this;
    }

    public LinkedListImpl insert(int index, int value){
        int size = size();

        if(index> size) return this;
        if(index == size){
            lastElement().next = new LinkedListImpl(value);
            return this;
        }

        if (index == 0){
            LinkedListImpl res = new LinkedListImpl(value);
            res.next = this;
            return res;
        }

        next = next.insert(index-1, value);
        return this;
    }

    public boolean update(int index, int value){
        if(index>size()) return false;
        if(index == 0){
            this.value = value;
            return true;
        }
        return next.update(index-1, value);
    }

    public boolean contains(int value){
        if (this.value == value) return true;
        if (next == null) return false;
        return next.contains(value);
    }

    public boolean containsIter(int val){
        LinkedListImpl mNext = this;
        do{
            if (mNext.value == val) return true;
            mNext = mNext.next;
        }while (mNext != null);
        return false;
    }

}
