package net.thexcoders.data_structures.hash_tables;

public class HashTableImpl implements HashTable {


    private final int PRIME = 2069;
    private String[] values = new String[PRIME];

    private int hashFunction(String key){
        int result = 0;
        for (char c : key.toCharArray()){
            result+= c;
        }
        return result;
    }

    // hash the key using the hasFunction and add the value in case the spot is null ( empty )
    @Override
    public boolean addToTable(String key, String value) {
        int code = hashFunction(key);
        if(values[code] == null ) {
            values[code]  = value;
            return true;
        }
        return false;
    }

    @Override
    public void clearTable() {
        values = new String[PRIME];
    }


    // get the element at the position referred by the key
    public String get(String key){
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
        if(!contains(key)) return false;
        return value.equals(get(key));
    }
}
