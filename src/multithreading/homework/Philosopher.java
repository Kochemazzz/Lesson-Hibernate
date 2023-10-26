package multithreading.homework;
import java.util.Random;

import static java.lang.Thread.sleep;
public class Philosopher implements Runnable {
    static Object spoon = new Object();

    String name;
    int spagetti;
    Random random = new Random();
    private Philosopher() {
    }
    public Philosopher(String name, int spagetti) {
        this.name = name;
        this.spagetti = spagetti;
    }
    @Override
    public void run() {
            System.out.println(getName() + " сел за стол!");
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println(getName() + " размышляет.......");
                    sleep(thinging());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (getSpagetti() == 0) {
                    System.out.println(getName() + " съел спагетти!");
                    System.out.println(getName() + " закончил есть!");
                    return;
                }
                System.out.println("Взял ложку " + Spoon.spoon.toString());
                System.out.println(getName() + " ест спагетти. Осталось спагетти :" + getSpagetti());
                eatSpagetti();
            }

    }
    public String getName() {
        return "Филосов " + name;
    }
    public int eatSpagetti() {
        return spagetti--;
    }
    public int getSpagetti() {
        return spagetti;
    }
    public int thinging() {
        return random.nextInt(5000);
    }
}
