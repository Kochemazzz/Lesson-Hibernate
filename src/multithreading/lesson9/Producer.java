package multithreading.lesson9;
public class Producer extends Thread {
    private final Product product1;
    public Producer(Product product1) {
        super("Producer");
        this.product1 = product1;
    }
    @Override

    public void run() {
        synchronized (product1) {
            while (true) {
                if (product1.isConsumred()) {
                    product1.produce();
                    product1.notify();
                }
                else {
                    try {
                        product1.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}