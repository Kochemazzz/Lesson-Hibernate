package multithreading.lesson7;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public class StockMarket extends Thread{
    private AtomicLong index;
    private Random random = new Random();
    public StockMarket(AtomicLong index){
        this.index = index;
    }
    @Override
    public void run() {
        while(true){

            var i = index.addAndGet(random.nextInt(30) -10);
            System.out.println(i + " is publish");
            try {
                sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public AtomicLong getIndex() {
        return index;
    }
}
