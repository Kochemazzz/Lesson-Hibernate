package multithreading.stepikoop19;
import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> youngs = new ArrayList<>();
        ArrayList<Student> old = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] output = input.split(" ");
            if (Integer.parseInt(output[2]) > 18) {
                youngs.add(new Student(output[0], Double.parseDouble(output[1]), Integer.parseInt(output[2])));
            } else if (Integer.parseInt(output[2]) < 18) {
                old.add(new Student(output[0], Double.parseDouble(output[1]), Integer.parseInt(output[2])));
            }
        }

    }
}
