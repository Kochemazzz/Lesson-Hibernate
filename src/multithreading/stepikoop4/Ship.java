package multithreading.stepikoop4;
public class Ship implements Transport {
    private double maxWeight;
    private double factWeight;
    public Ship(double weight) {
        this.maxWeight = weight;
    }
    @Override
    public boolean canCarry(double weight) {
        if (maxWeight >= weight) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void add(double weight) {
        this.factWeight += weight;
    }
    @Override
    public double getTotalWeight() {
        return 0;
    }
    @Override
    public String toString() {
        return "Ship{" +
                "maxWeight=" + maxWeight +
                ", totalWeight=" + factWeight +
                '}';
    }

}
