package net.thexcoders.data_structures.linked_lists;

public interface DoubleLinkedList {

    int size() ;

    int valueAt(int value) ;

    DoubleLinkedList lastElement();

    DoubleLinkedList remove(int index);

    DoubleLinkedList insert(int index, int value);

    boolean update(int index, int value) ;

}
