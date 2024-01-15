package multithreading.stepikoop14;
import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String[] array = input1.split("");
        String operator = null;
        String a = "";
        String b = "";
        for (int i = 0; i < array.length; i++) {
            try {
                if (operator != null) {
                    b = b + (array[i]);
                }
                if (Character.isDigit(Integer.parseInt(array[i])) && operator == null) {
                    System.out.println("+");
                } else if (operator == null) {
                    a = a + (array[i]);
                }
            } catch (NumberFormatException e) {
                operator = array[i];
            }
        }
        try {
            if (a.equals("") || a.equals("") || operator.equals(null)) {
                System.out.println("Error");
                return;
            }
        } catch (Exception e) {
            System.out.println("Error");
            return;
        }
        int newA = 0;
        int newB = 0;
        try {
            newA = Integer.parseInt(a);
            newB = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            return;
        }
        switch (operator) {
            case "+":
                int sum = newA + newB;
                System.out.println(a + "+" + b + "=" + sum);
                break;
            case "-":
                int min = newA - newB;
                System.out.println(a + "-" + b + "=" + min);
                break;
            case "*":
                int multiplication = newA * newB;
                System.out.println(a + "*" + b + "=" + multiplication);
                break;
            case "/":
                if (newB == 0) {
                    System.out.println("Error");
                    break;
                }
                int division = 0;
                try {
                    division = (int) ((double) newA / newB);
                } catch (Exception e) {
                    System.out.println("Error");
                    return;
                }
                System.out.println(a + "/" + b + "=" + division);
                break;
            case "%":
                int remainder = 0;
                try {
                    remainder = newA % newB;
                } catch (Exception e) {
                    System.out.println("Error");
                    return;
                }
                System.out.println(a + "%" + b + "=" + remainder);
                break;
            default:{
                System.out.println("Error");
            }
        }
    }
}
