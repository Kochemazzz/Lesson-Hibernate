package multithreading.stepikoop18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        while (true) {
            String input = (scanner.next());
            if (input.equals("finish")) {
                break;
            }
            try {
                int newInput = Integer.parseInt(input);
                if (newInput >= 0) {
                    one.add(newInput);
                } else if (newInput < 0) {
                    two.add(newInput);
                }
            } catch (NumberFormatException e) {
                one.add(0);
            }
        }
        if (one.isEmpty()) {
            System.out.println("Пустой список");
        }
        if (!one.isEmpty()) {
            Collections.sort(one);
            for (int i = 0; i < one.size(); i++) {
                System.out.print(one.get(i) + " ");
            }
            System.out.println();
        }
        if (two.isEmpty()) {
            System.out.println("Пустой список");
        }
        if (!two.isEmpty()) {
            Collections.sort(two);
            for (int i = 0; i < two.size(); i++) {
                System.out.print(two.get(i) + " ");
            }
            System.out.println();
        }
    }
}
