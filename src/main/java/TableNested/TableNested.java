package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return entries.get(i).getValue();
            }
        }
        return null;
    }


    public void put(K key, V value) {
        boolean keyExists = false;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.set(i, new Entry(key, value));
                keyExists = true;
            }
        }
        if (!keyExists) {
            Entry newEntry = new Entry(key, value);
            entries.add(newEntry);
        }
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(i);
            }
        }
    }
    
    
    public class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }

}
