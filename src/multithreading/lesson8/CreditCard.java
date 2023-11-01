package multithreading.lesson8;
import java.util.concurrent.atomic.AtomicInteger;
public class CreditCard {
    private double money;
    public CreditCard(double money) {
        this.money = money;
    }
    public synchronized Boolean takeMoney (double money){
        if(getMoney() <= 0){
            System.out.println("Not enough momey");
            return false;
        }
        setMoney(getMoney()-money);
        return true;

    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
}
