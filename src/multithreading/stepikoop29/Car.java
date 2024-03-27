package multithreading.stepikoop29;
public class Car {
    private String name;
    private double valueEngine;
    public Car(String name, double valueEngine) {
        this.name = name;
        this.valueEngine = valueEngine;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(name).append(";");
        sb.append(valueEngine);
        return sb.toString();
    }
}
