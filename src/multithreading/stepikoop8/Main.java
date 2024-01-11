package multithreading.stepikoop8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        Random random = new Random(start);
        int getDevision = random.nextInt(-10,11);
        int[] array1 = new int[0];
        try {
            array1 = new int[getDevision];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = i;
            }
            System.out.println(Arrays.toString(array1));
        } catch (NegativeArraySizeException e) {
            System.out.println("Неверный размер массива:" + getDevision);
        }
    }
}
