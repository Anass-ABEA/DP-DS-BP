package net.thexcoders.data_structures.hash_tables;

import java.util.ArrayList;

public class HashTableImproved implements HashTable {
    private final int PRIME = 2069;

    private ArrayList<String>[] values = new ArrayList[PRIME];

    private int hashFunction(String key) {
        int result = 0;

        for (char c : key.toCharArray()) {
            result += c;
        }

        return result;
    }


    // hash the key using the hasFunction and add the value to the list if it exists
    // or create a new list with the one single value then add it
    @Override
    public boolean addToTable(String key, String value) {
        int code = hashFunction(key);
        if (values[code] == null) {
            ArrayList<String> tempList = new ArrayList<>();
            tempList.add(value);
            values[code] = tempList;

        }
        values[code].add(value);
        return true;
    }

    @Override
    public void clearTable() {
        values = new ArrayList[PRIME];
    }


    // get the list of values at the position referred by the key
    public ArrayList<String> get(String key) {
        return values[hashFunction(key)];
    }


    // check if the element at the position referred by the key exists
    @Override
    public boolean contains(String key) {
        return get(key) != null;
    }


    // check if the element at the position referred by the key exists and has the expected value
    @Override
    public boolean contains(String key, String value) {
        if (!contains(key))
            return false;
        ArrayList<String> tempList = get(key);
        for (String str : tempList) {
            if (str.equals(value))
                return true;
        }
        return false;
    }
}
