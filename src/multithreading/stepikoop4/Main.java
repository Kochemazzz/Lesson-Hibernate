package multithreading.stepikoop4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transport[] transports = new Transport[scanner.nextInt()];
        int count = 0;
        for (Transport transport : transports) {
            int choose = scanner.nextInt();
            if (choose == 1){
                transports[count] = new Lorry(scanner.nextDouble());
            }
            else if ( choose == 2){
                transports[count] = new Ship(scanner.nextDouble());
            }
            count++;
        }
        double weight = scanner.nextDouble();
        for (Transport transport : transports) {
            if(transport.canCarry(weight)){
                transport.add(weight);
            }
            System.out.println(transport);
        }


     }
}
