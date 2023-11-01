package multithreading.lesson6;
public class MainTwo {
    public static void main(String[] args) {
        IsDaemonThread isDaemonThread1 = new IsDaemonThread();
        IsDaemonThread isDaemonThread2 = new IsDaemonThread();
        isDaemonThread2.setDaemon(true);
        isDaemonThread1.start();
        isDaemonThread2.start();
        System.out.println("static Main is dead");



    }
}
class IsDaemonThread extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Our daemon is starting...");
                sleep(10);
            } else {
                System.out.println("Main Thread is starting...");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("Main thread is dead");
            } else {
                System.out.println("Daemon is dead");
            }
        }
    }
}