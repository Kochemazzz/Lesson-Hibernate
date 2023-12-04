package multithreading.lesson9;
public class Consumer extends Thread {
    private  final Product product1;
    public Consumer(Product product1) {
        super("Consumer");
        this.product1 = product1;
    }
    @Override
    public void run() {
        synchronized (product1) {
            while (true) {
                if (product1.isProduced()) {
                    product1.consurme();
                    product1.notify();
                } else {
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