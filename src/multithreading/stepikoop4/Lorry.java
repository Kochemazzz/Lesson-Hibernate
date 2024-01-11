package multithreading.stepikoop4;
public class Lorry implements Transport {
    private double maxWeight;
    private double factWeight;
    public Lorry(double maxWeight) {
        this.maxWeight = maxWeight;
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
        return "Lorry{" +
                "maxWeight=" + maxWeight +
                ", totalWeight=" + factWeight +
                '}';
    }
    public void setFactWeight(double factWeight) {
        this.factWeight = factWeight;
    }
}
