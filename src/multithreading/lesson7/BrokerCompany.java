package multithreading.lesson7;
public class BrokerCompany extends Thread {
    private static StockMarket stockMarket;
    private static final int TIMEOUT = 500;
    public static void initStockMarket(StockMarket stockMarket){
        BrokerCompany.stockMarket = stockMarket;

    }
    @Override
    public void run() {
        while(true){
            System.out.println(stockMarket.getIndex() + " broker is reading");
            try {
                sleep(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
