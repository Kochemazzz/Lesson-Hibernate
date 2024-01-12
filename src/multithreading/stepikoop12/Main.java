package multithreading.stepikoop12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Luggage luggage = new Luggage(10);
        Scanner scanner = new Scanner(System.in);
        double bag = scanner.nextDouble();
        System.out.println("Надо пройти регистрацию на рейс");
        try {
            luggage.checkLuggage(bag);
            System.out.println("Доплата за вес не нужна");
        } catch (HeavyLuggageException e) {
            System.out.println(e.getMessage());
            System.out.println("Нужно оплатить превышение веса по тарифу");
        } finally {
            System.out.println("Регистрация пройдена");
        }
    }
}
