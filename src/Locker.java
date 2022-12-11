public class Locker<T, K> {
    private T elem1;
    private K elem2;

    public void setValues(T elem1, K elem2) {
        this.elem1 = elem1;
        this.elem2 = elem2;
    }

    public T getElem1() {
        return elem1;
    }

    public K getElem2() {
        return elem2;
    }
}
