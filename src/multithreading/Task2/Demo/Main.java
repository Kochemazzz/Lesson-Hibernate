package multithreading.Task2.Demo;
import multithreading.Task2.Library.Bridge;
import multithreading.Task2.Library.SuspensionBridge;
import multithreading.Task2.Library.WaterBridge;
public class Main {
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
    public static void main(String[] args) {
        Bridge WaterBridge = new WaterBridge();
        Bridge SuspensionBridge = new SuspensionBridge();
        println(WaterBridge);
        try {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
