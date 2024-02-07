package multithreading.stepikoop21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[9] = 1;
        System.out.println(array.length);
        int[] copiedArray = Arrays.copyOf(array, 15);
        System.out.println(Arrays.toString(copiedArray));

    }
}
