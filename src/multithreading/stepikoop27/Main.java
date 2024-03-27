package multithreading.stepikoop27;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        ReverseArray reverse = new ReverseArray(array);
        for (Integer item : reverse) {
            System.out.print(item + " ");
        }
    }
}
