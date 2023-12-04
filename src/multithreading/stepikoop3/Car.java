package multithreading.stepikoop3;
import java.util.Calendar;
import java.util.Scanner;
public class Car {
    private String model;
    private String surname;
    private double engineCapacity;
    private int year;
    private static int yearNow;
    static {
        Calendar cal = Calendar.getInstance(); //не забыть импортировать класс java.util.Calendar!
        yearNow = cal.get(Calendar.YEAR);
    }
    public Car() {
    }
    public Car(String model, String surname, double engineCapacity, int year) {
        this.model = model;
        this.surname = surname;
        this.engineCapacity = engineCapacity;
        this.year = year;
    }
    public int getLife() {
        return yearNow - year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public static int getYearNow() {
        return yearNow;
    }
    public static void setYearNow(int yearNow) {
        Car.yearNow = yearNow;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + model + '\'' +
                ", owner='" + surname + '\'' +
                ", volume=" + engineCapacity +
                ", yearOfMade=" + year + '}';
    }

}
