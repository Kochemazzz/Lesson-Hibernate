package multithreading.stepikcloneoop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("ERROR");
            System.exit(0);
        }
        BusinessTrip[] businessTrips = new BusinessTrip[size];
        int count = 0;
        for (BusinessTrip businessTrip : businessTrips) {
            if (count == size - 1) {
                businessTrips[count] = new BusinessTrip(businessTrips[0]);
                scanner.skip("\n");
                businessTrips[0].setSurname(scanner.next());
            } else {
                businessTrips[count] = new BusinessTrip();
                businessTrips[count].setSurname(scanner.next());
                businessTrips[count].setCountDays(scanner.nextInt());
                businessTrips[count].setFare(scanner.nextInt());
                businessTrips[count].setTotal(businessTrips[count].getTotal());
                count++;
            }
        }
        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }
        System.out.println();
        int index = scanner.nextInt();
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip.getTotal() == businessTrips[index].getTotal()) {
                System.out.println(businessTrip);
            }
        }
    }
}
class BusinessTrip {
    private int DAILY_ALLOWANCE = 25;
    private String surname;
    private int countDays;
    private int fare;
    private int total;
    public void setTotal(int total) {
        this.total = total;
    }
    public BusinessTrip(String surname, int countDays, int fare) {
        this.surname = surname;
        this.countDays = countDays;
        this.fare = fare;
    }
    public BusinessTrip() {
        this.surname = "";
        this.countDays = 0;
        this.fare = 0;
        this.total = 0;
    }
    public BusinessTrip(String surname) {
        this.surname = surname;
    }
    public BusinessTrip(Object object) {
        BusinessTrip businessTrip = (BusinessTrip) object;
        this.surname = businessTrip.getSurname();
        this.countDays = businessTrip.getCountDays();
        this.fare = businessTrip.getFare();
        this.total = businessTrip.getTotal();
    }
    public int getTotal() {
        int total = fare + DAILY_ALLOWANCE * countDays;
        return total;
    }
    public void show() {
        System.out.println("Суточные = " + DAILY_ALLOWANCE);
        System.out.println("Транспортные расходы = " + fare);
        System.out.println("Количество дней = " + countDays);
        System.out.println("Итого расходы = " + getTotal());
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getCountDays() {
        return countDays;
    }
    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }
    public int getFare() {
        return fare;
    }
    public void setFare(int fare) {
        this.fare = fare;
    }
    @Override
    public String toString() {
        return surname + ';' + countDays + ";" + fare + ";" + total;
    }
    //    //put your code here
}