package multithreading.stepikoop14;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String example = scanner.nextLine();
//        String[] array = example.split("[+,*,/,%]");
        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();




        switch (operator){
            case "+":
                int sum = a + b;
                System.out.println(a+"+"+b+"="+sum);
                break;
            case "-":
                int min = a - b;
                System.out.println(a+"-"+b+"="+min);
                break;
            case "/":
                double division = (double) a /b;
                System.out.println(a+"/"+b+"="+division);
                break;
            case "%":
                double remainder = a%b;
                System.out.println(a+"%"+b+"="+remainder);
                break;
            default:
                System.out.println("Error");
                return;
        }

    }
}
