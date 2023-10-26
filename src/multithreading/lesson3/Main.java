package multithreading.lesson3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
public class Main {
    public static void main(String[] args) {
        int end = 100000000;
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i <end ; i++) {
            numbers.add(Long.valueOf(i));
        }
        System.out.println();
        ForkJoinTask<Long> task1 = new WorkForkJoin(numbers);
        Long result = new ForkJoinPool().invoke(task1);
        System.out.println(result);
    }
}
