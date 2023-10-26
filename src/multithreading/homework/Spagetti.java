package multithreading.homework;
import java.util.Random;
public class Spagetti {
    private int count;
    private Random random = new Random();
    public int getSpagetti() {
        return count = random.nextInt(21);
    }
}
