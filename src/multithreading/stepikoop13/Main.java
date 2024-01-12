package multithreading.stepikoop13;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1;
        while (true) {
            try {
                int dev = scanner.nextInt();
                array1 = new int[dev];
                break;
            } catch (InputMismatchException e) {
                System.out.println("Размер массива должен целым числом!");
                scanner.next();
            } catch (NegativeArraySizeException e) {
                System.out.println("Введите положительный размер массива!");
            }
        }
        for (int i = 0; i < array1.length; i++) {
            try {
                array1[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                array1[i] = 0;
                scanner.next();
            }
        }
        int getDevision = 0;
        try {
            getDevision = scanner.nextInt();
            System.out.println("Извлечено из массива: " + array1[getDevision]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный индекс!");
        }
        System.out.println(Arrays.toString(array1));
    }
}
