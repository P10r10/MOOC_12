public class List<T> {
    private final T[] values;
    private int index;
    public List() {
        values = (T[]) new Object[100];
    }

    public void add(T toAdd) {
        values[index] = toAdd;
        index++;
    }

    public T value(int i) {
        return values[i];
    }

    public boolean contains(T element) {
        return (indexOfElement(element) != -1);
    }

    public int indexOfElement(T element) {
        for (int i = 0; i < index; i++) {
            if (element.equals(values[i]) || element == values[i]) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return index;
    }

    public void remove(T element) {
        for (int i = indexOfElement(element); i < index; i++) {
            values[i] = values[i + 1];
        }
        index--;
    }
}
