package multithreading.stepikoop15;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("");
        int max = 0;
        int digit = 0;
        String makeDigit = "";
        for (int i = 0; i < array.length; i++) {
            if (digit > max) {
                max = digit;
                makeDigit = "";
            }
            if (array[i].matches("\\d+")) {
                makeDigit = makeDigit + array[i];
            } else {
                try {
                    digit = Integer.parseInt(makeDigit);
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.println(max);
    }
}
