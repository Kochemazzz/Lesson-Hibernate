package multithreading.stepikoop4;
public interface Transport {
    boolean canCarry(double weight);
    void add (double weight);
    double getTotalWeight();
}
