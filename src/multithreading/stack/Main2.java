package multithreading.stack;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        Stack stack = new Stack(scan.nextInt());
        char sim;
        while (true) {
            try {
                choice = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод данных");
                choice = 5;
            }
            switch (choice) {
                case 1:
                    sim = scan.next().charAt(0);
                    try {
                        stack.push(sim);
                    } catch (StackException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        sim = stack.pop();
                        System.out.println("Извлечено: " + sim);
                    } catch (StackException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    stack.print();
                    break;
                case 4:
                    stack.clear();
                    break;
                case 5:
                    return;
            }
        }
    }
}
