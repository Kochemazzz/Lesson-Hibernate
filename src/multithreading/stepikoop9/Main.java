package multithreading.stepikoop9;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        Random random = new Random(start);
        int getDivision = random.nextInt(1, 11);
        int[] array1 = new int[getDivision];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 0;
        }
        for (int i = 0; i < 3; i++) {
            try {
                array1[scanner.nextInt()] = scanner.nextInt();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Индекс не попал в массив");
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

