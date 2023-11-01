package multithreading.lesson9;
public class Producer extends Thread {
    Product product;
    public Producer(Product product) {
        this.product = product;
    }
    @Override
    public void run() {
        synchronized (product) {
            if (product.isConsumred()) {
                while (true) {
                    product.isProduced();
                    System.out.println("Продукт изготовлен");
                }
            }
            else{

            }
        }
    }
}
