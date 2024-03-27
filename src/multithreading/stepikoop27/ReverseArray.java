package multithreading.stepikoop27;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class ReverseArray implements Iterable<Integer>, Iterator<Integer> {
    private int[] array;
    private int count;
    public ReverseArray(int[] array) {
        this.array = array;
    }
    @Override
    public Iterator iterator() {
        count = 0;
        return this;
    }
    @Override
    public boolean hasNext() {
        return count < array.length;
    }
    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        count++;
        return array[array.length - count];
    }
}
