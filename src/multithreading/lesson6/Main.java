package multithreading.lesson6;
import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Start one");
            try {
                sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Stop one......");
        });
        thread1.start();
        JoinThread joinThread = new JoinThread();
        joinThread.start();
        try {
            joinThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End :" + Thread.currentThread().getName());
    }

}
class JoinThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Start two...");
            sleep(10);
            System.out.println("Stop two....");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

