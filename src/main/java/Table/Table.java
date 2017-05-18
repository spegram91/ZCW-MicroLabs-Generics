package Table;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> entries;

    public Table() {
        entries = new ArrayList<Entry<K, V>>();
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
                entries.set(i, new Entry<K, V>(key, value));
                keyExists = true;
            }
        }
        if (!keyExists) {
            Entry<K, V> newEntry = new Entry<K, V>(key, value);
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
}
