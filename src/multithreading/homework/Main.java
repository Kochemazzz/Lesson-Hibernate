package multithreading.homework;
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Philosopher("1",new Spagetti().getSpagetti()));
        thread.start();

    }

}
