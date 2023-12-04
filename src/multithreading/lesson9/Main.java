package multithreading.lesson9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) {
        Product product = Product.getInstance();
        Thread thread1 = new Thread(new Producer(product));
        Thread thread2 = new Thread(new Consumer(product));
        thread1.start();
        thread2.start();

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.submit(new Producer(product));
//        executorService.submit(new Consumer(product));
//        executorService.shutdown();

    }
}
