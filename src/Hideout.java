public class Hideout<T> {
    T hideout;

    public Hideout() {
        hideout = null;
    }

    public void putIntoHideout(T toHide) {
        if (toHide.equals(hideout)) {
            hideout = null;
        } else {
            hideout = toHide;
        }
    }

    public T takeFromHideout() {
        T toReturn = hideout;
        hideout = null;
        return toReturn;
    }

    public boolean isInHideout() {
        return hideout != null;
    }
}
