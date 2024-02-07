package multithreading.stepikoop20;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws StackException {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(10);
        while (true) {
            String all = scanner.nextLine();
            String[] param = all.split(" ");
            String a = param[0];

            if (a.equalsIgnoreCase("конец")) {
                if (stack.getArrayList().isEmpty()) {
                    System.out.println("Стек пустой");
                    break;

                }
                for (int i = 0; i <= stack.getArrayList().size() + 2; i++) {
                    System.out.print(stack.pop() +" ");
                }
                break;
            }
            Double b = Double.valueOf(param[1]);
            Integer c = Integer.valueOf(param[2]);
            stack.push(new Student(a, b, c));

        }
    }
}
