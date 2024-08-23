package etc.generic.basic;

public class MultiBox<K,V> {
    private K key;
    private V value;

    public MultiBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get() {
        return this.value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
