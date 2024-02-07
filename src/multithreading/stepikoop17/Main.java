package multithreading.stepikoop17;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = null;
        Dog dog2 = null;
        dog1 = new Dog(scanner.next(), scanner.next(), scanner.next(),Double.parseDouble(scanner.nextLine()));
        dog2 = new Dog(scanner.next(), scanner.next(), scanner.next(), Double.parseDouble(scanner.nextLine()));
        dog1.CompareTo(dog2);
    }



}

