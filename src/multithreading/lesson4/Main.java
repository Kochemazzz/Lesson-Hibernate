package multithreading.lesson4;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Long timestamp = System.currentTimeMillis();
        Callable<Integer> task = () -> IntStream.range(0,1_000_000_0)
                .boxed()
                .parallel()
                .map(x ->x/3)
                .peek(t -> System.out.println(Thread.currentThread().getName()))
                .reduce((x,y) -> x+y)
                .get();
        ForkJoinPool forkJoinPool = new ForkJoinPool(8);
        try {
            int result = forkJoinPool.submit(task).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println((System.currentTimeMillis() - timestamp)/1000);
    }
}
