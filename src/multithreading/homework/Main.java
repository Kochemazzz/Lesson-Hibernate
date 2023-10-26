package multithreading.homework;
public class Main {
    public static void main(String[] args) {
        synchronized (Spoon.spoon) {
            Thread thread1 = new Thread(new Philosopher("1", new Spagetti().getSpagetti()));
            Thread thread2 = new Thread(new Philosopher("2", new Spagetti().getSpagetti()));
            Thread thread3 = new Thread(new Philosopher("3", new Spagetti().getSpagetti()));
            Thread thread4= new Thread(new Philosopher("4", new Spagetti().getSpagetti()));
            Thread thread5 = new Thread(new Philosopher("5", new Spagetti().getSpagetti()));
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
        }

    }

}
