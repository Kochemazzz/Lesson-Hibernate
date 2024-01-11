package multithreading.stepikoop10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cook cook = new Cook();
        cook.turnOvenOn();
        try {
            cook.bake(scanner.nextLine());
        } catch (BackingException e) {
            System.out.println("Блюдо испортилось: " + e.getMessage());
        }
        cook.turnOvenOff();
    }
}
