package multithreading.lesson13;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

import static java.lang.Thread.sleep;
public class Main {
    //Deadlocks
    //await - wait -> waiting
    //signal - notify
    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        Random random = new Random();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    transfer.transfer(random.nextInt(100));
                }
            }
        });
        thread.start();
        transfer.deposit(100000);







//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.execute(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    while (true) {
//                        transfer.transfer(random.nextInt(10000));
//                        sleep(1000);
//                    }
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }));
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    transfer.deposit(random.nextInt(100));
//                }
//            }
//        });
    }
}
