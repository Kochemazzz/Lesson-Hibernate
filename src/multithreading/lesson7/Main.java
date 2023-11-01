package multithreading.lesson7;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicLong;
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket(new AtomicLong(100));
        BrokerCompany.initStockMarket(stockMarket);
        stockMarket.start();
        for (int i = 0; i < 30; i++) {
            new BrokerCompany().start();
        }



    }
}
