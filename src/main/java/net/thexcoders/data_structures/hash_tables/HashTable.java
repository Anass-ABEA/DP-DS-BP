package net.thexcoders.data_structures.hash_tables;

public interface HashTable {

    boolean addToTable(String key, String value);

    void clearTable();

    boolean contains(String key);

    boolean contains(String key, String value);
}
