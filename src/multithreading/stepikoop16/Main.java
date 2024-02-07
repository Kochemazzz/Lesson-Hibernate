package multithreading.stepikoop16;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split("#");
        double sum = 0;
        for (int i = 0; i < strings.length; i++) {
            try {
                double num = Double.parseDouble(strings[i]);
                sum = sum + num;
            } catch (NumberFormatException e) {
            }
        }
        System.out.printf("%.1f", sum);
    }
}
