package multithreading.stepikoop26;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.sort;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";|\n");
        Comment[] array = new Comment[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {

            array[i] = new Comment(scanner.next(), scanner.next(), scanner.nextInt());
        }
        sort(array, Comparator.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        sort(array, (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
