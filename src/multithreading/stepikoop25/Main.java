package multithreading.stepikoop25;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.sort;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase[] array = new Purchase[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Purchase(scanner.next(), scanner.nextInt(), scanner.nextInt());
        }
        sort(array);
        for (Purchase purchase : array) {
            System.out.println(purchase);
        }
        sort(array, (o1, o2) -> {
            if (o1.totalCost() > o2.totalCost()) return +1;
            if (o1.totalCost() < o2.totalCost()) return -1;
            return 0;
        });
        System.out.println();
        for (Purchase purchase : array) {
            System.out.println(purchase);
        }

    }
}
