package multithreading.stepikoop23;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Purchase> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] splitInput = input.split(" ");
            int a = Integer.parseInt(splitInput[0]);
            if (a == 1) {
                list.add(new Purchase(splitInput[1], Integer.parseInt(splitInput[2]), Integer.parseInt(splitInput[3])));
            } else {
                list.add(new DiscountPurchase(splitInput[1], Integer.parseInt(splitInput[2]), Integer.parseInt(splitInput[3]), Integer.parseInt(splitInput[4])));
            }
            input = scanner.nextLine();
        }
        System.out.println("Total sum = " + getTotalSum(list));
    }
    public static int getTotalSum(ArrayList<? extends Purchase> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getCost();
        }
        return sum;
    }
}