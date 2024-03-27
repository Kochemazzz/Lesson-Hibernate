package multithreading.stepikoop28;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class Range implements Iterable<Integer>, Iterator<Integer> {
    private int[] array;
    private int count;
    public Range(int start, int end) {
        this.array = new int[end - start + 1];
        int count = 0;
        for (int i = start; i <= end; i++) {
            this.array[count++] = i;
        }
    }
    @Override
    public Iterator<Integer> iterator() {
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
        return array[count++];
    }
}
