package multithreading.lesson1;
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        Thread thread = new Thread(new SecondWork());
        // new, runnable, terminated, waiting, blocked, time waiting
        // Thread pool

        System.out.println(work.getState());
        work.start();
        System.out.println(work.getState());
        try {
            work.interrupt();
        } catch (Exception e) {
            System.out.println("Thread is interrupted");
        }
        System.out.println(work.getState());
        thread.start();

        //Race condition


    }
}