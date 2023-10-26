package multithreading.lesson1;
public class SecondWork implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(i + " multithreading.lesson1.SecondWork");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
