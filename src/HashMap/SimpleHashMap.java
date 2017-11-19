package HashMap;

import java.util.*;

class Mpair implements Map.Entry, Comparable {
    Object key, value;

    Mpair(Object k, Object v) {
        key = k;
        value = v;
    }

    @Override
    public int compareTo(Object o) {
        return ((Comparable) key).compareTo(((Mpair) o).key);
    }

    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Object setValue(Object v) {
        Object result = value;
        //this.value = v;
        value = v;
        return result; //this.value;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return key.equals(o);
    }
}

public class SimpleHashMap extends AbstractMap {
    final LinkedList[] busket = new LinkedList[100];
    private final static int sz = 997;

    @Override
    public Object put(Object key, Object value) {
        Object result = null;
        int index = key.hashCode() % sz;

        if (index < 0) index = -index;

        if (busket[index] == null)
            busket[index] = new LinkedList();

        Iterator it = busket[index].listIterator();
        boolean has_same = false;
        while (it.hasNext()) {
            if (it.hasNext()) {
                Object cur_pair = it.hasNext();
                if (cur_pair(key)) {

                }
            }
        }
        return result;
    }

    private boolean cur_pair(Object key) {
    return true;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
