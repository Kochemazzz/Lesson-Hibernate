package multithreading.lesson5;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Counter(), 1000, 3000);
        if (Counter.getI() == 5) {
            timer.cancel();
        }
    }
}
class Counter extends TimerTask {
    public static int i;
    public static int getI() {
        return i;
    }
    @Override
    public void run() {
        if (i == 5) {
            this.cancel();
        }
        System.out.println(++i);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("\t" + i);
    }
}
