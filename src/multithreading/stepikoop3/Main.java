package multithreading.stepikoop3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Car[] cars = new Car[size];
        int count = 0;
        for (Car car : cars) {
            cars[count] = new Car(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());
            count++;
        }
        cars[scanner.nextInt()-1].setEngineCapacity(scanner.nextDouble());
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
        double max = cars[0].getEngineCapacity();
        for (Car car : cars) {
            if (max > car.getEngineCapacity()) {
                max = car.getEngineCapacity();
            }
        }
        for (Car car : cars) {
            if(max == car.getEngineCapacity()){
                System.out.println(car);
            }
        }
    }
}
