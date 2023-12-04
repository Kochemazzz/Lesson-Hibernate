package multithreading.lesson11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");
        ExecutorService executorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
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
                        Thread.sleep(1000);
                        System.out.println(counter);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });



    }
}