package net.thexcoders.data_structures.linked_lists;

public interface LinkedList {

    int size() ;

    int valueAt(int value) ;

    LinkedList lastElement();

    LinkedList remove(int index);

    LinkedList insert(int index, int value);

    boolean update(int index, int value) ;

}
