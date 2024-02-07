package multithreading.stepikoop21;
import java.util.Arrays;
public class MySet<E> {
    private E[] array;
    int index = -1;
    public MySet() {
        this.array = (E[]) new Object[10];
    }
    public MySet(int i) {
        this.array = (E[]) new Object[i];
    }
    public void add(E object) {
        if (index == -1) {
            array[++index] = object;
        }
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                return;
            }
        }
        if (array.length - 1 == index) {
            array = Arrays.copyOf(array, (int) (array.length * 1.5));
            array[++index] = object;
        } else {
            array[++index] = object;
        }
    }
    public void print() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){}
            else {
                System.out.println(array[i]);
            }
        }
    }
}