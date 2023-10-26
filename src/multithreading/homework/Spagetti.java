package multithreading.homework;
import java.util.Random;
public class Spagetti {
    private Random random = new Random();
    public int getSpagetti() {
        return random.nextInt(21); // кол-во спагетти
    }
}
