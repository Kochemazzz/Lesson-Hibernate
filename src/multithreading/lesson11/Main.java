package multithreading.lesson11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread();
//                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                int counter = 0;
                try {
                    while (true) {
                        counter++;
                        sleep(1000);
                        System.out.println(counter);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        try {
            for (int i = 0; i <100000 ; i++) {
                System.out.println("Hello");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
