package multithreading.lesson9;
public class Consumer extends Thread{
    Product product;
    public Consumer(Product product){
        this.product = product;
    }
    @Override
    public void run() {
        synchronized (product){
            if(product.isProduced()){
                while(true){
                    product.isConsumred();
                    System.out.println("Продукт употреблен");
            }

            }
            else{
                product.notify();
            }
        }

    }
}
