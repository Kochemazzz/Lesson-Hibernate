package multithreading.stepikoop29;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ErrorBoxException {
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        Garage garage = new Garage(capacity);
        while (true) {
            String choose = scan.next();
            switch (choose) {
                case "1":
                    choose = "1";
                    String a = scan.next();
                    double b = scan.nextDouble();
                    int c = scan.nextInt();
                    try {
                        garage.putCar(new Car(a, b), c - 1);
                    } catch (ErrorBoxException | ArrayIndexOutOfBoundsException e) {
                        if (garage.getFreeBoxNumber() == -1) {
                            break;
                        } else {
                            garage.putCar(new Car(a, b), garage.getFreeBoxNumber());
                            break;
                        }
                    }
                    break;
                case "2":
                    choose = "2";
                    try {
                        garage.getCar(scan.nextInt() - 1);
                        break;
                    } catch (ErrorBoxException e) {
                        throw new ErrorBoxException("ERROR");
                    }
                case "3":
                    System.out.println("----------------");
                    choose = "3";
                    for (Car car : garage) {
                        System.out.println(car);
                    }
                    System.out.println("----------------");
                    break;
                case "4":
                    choose = "4";
                    return;
            }
        }
    }
}
