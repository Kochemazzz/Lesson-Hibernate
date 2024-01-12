package multithreading.stepikoop11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking((byte) 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приехали на парковку");
        try {
            parking.check((byte) scanner.nextInt());
            System.out.println("Припарковались");
        } catch (TooManyCarsException e) {
            System.out.println(e.getMessage());
            System.out.println("Припарковались в другом месте");
        } finally {
            System.out.println("Выходим из машин");
        }
    }
}
