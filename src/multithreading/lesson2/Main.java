package multithreading.lesson2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        var integers = IntStream.range(0,1000).boxed().collect(Collectors.toList());
        List<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i <1000 ; i++) {
            integers1.add(i);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> integerFuture = executorService.submit(new Work(integers1));
        executorService.shutdown();
        try {
            System.out.println(integerFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
