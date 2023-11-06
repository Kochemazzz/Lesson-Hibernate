package multithreading.lesson10;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 1_000_000_0; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
                System.out.println("Cумма четных числе равна: " + sum);
                countDownLatch.countDown();
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 1_000_000_0; i++) {
                    if (i % 7 == 0) {
                        sum += i;
                    }
                }
                System.out.println("Cумма чисел, которые делятся на 7: " + sum);
                countDownLatch.countDown();
            }
        };
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                List<Integer> listInt = new ArrayList<>();
                for (int i = 0; i < 1_000_000_0; i++) {
                    listInt.add(random.nextInt(1000));
                }
                long countDigit = 0;
                for (Integer i : listInt) {
                    if (i % 2 == 0) {
                        countDigit++;
                    }
                }
                System.out.println("Кол-во четных чисел в коллекции: " + countDigit);
                countDownLatch.countDown();
            }
        };

        long before = System.currentTimeMillis();
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long after = System.currentTimeMillis();
        System.out.println("Время на выполнение составило: " + (after-before));

    }

}
