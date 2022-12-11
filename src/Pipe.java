import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Pipe<T> {
    private List<T> pipe;

    public Pipe() {
        pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    public T takeFromPipe() {
        if (pipe.size() == 0) {
            return null;
        }
        return pipe.remove(0);
    }
    public boolean isInPipe() {
        return pipe.size() > 0;
    }
}
