public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int nextFreeIndex;

    public HashMap() {
        values = new List[32];
        nextFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            values[hashValue].add(new Pair<>(key, value));
        }
    }
}
