package multithreading.stepikoop29;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class Garage implements Iterable<Car>, Iterator<Car> {
    private Car[] cars;
    private int box;
    public Garage(int count) {
        this.cars = new Car[count];
    }
    public void putCar(Car unit, int i) throws ErrorBoxException {
        if (cars[i] != null) {
            throw new ErrorBoxException();
        } else {
            cars[i] = unit;
        }
    }
    public Car getCar(int i) throws ErrorBoxException {
        Car copy = cars[i];
        if (copy == null) {
            System.out.println("ERROR");
            return copy;
        } else {
            cars[i] = null;
            System.out.println(copy);
            return copy;
        }
    }
    public boolean isFree(int number) {
        if (cars[number] == null) {
            return false;
        } else {
            return true;
        }
    }
    public int getFreeBoxNumber() {
        for (int i = cars.length - 1; i >= 0; i--) {
            if (cars[i] == null) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public Iterator<Car> iterator() {
        box = 0;
        return this;
    }
    @Override
    public boolean hasNext() {
        return box < cars.length;
    }
    @Override
    public Car next() {
        if (!hasNext()) throw new NoSuchElementException();
        box++;
        return cars[cars.length - box];
    }
    public int getCount() {
        return box;
    }
}