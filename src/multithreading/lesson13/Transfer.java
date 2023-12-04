package multithreading.lesson13;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Transfer {
    private int cash = 1000000;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void deposit(int cash) {
        if (lock.tryLock()) {
            try {
                lock.lock();
                this.cash += cash;
                lock.unlock();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                condition.signal();
                lock.unlock();
            }
        }
        else {
            throw new RuntimeException("Error deposit");
        }
    }
    public void transfer(int cash) {
        if (lock.tryLock()) {
            try {
                lock.lock();
                while (cash <= 0) {
                    System.out.println("Отрицательный баланс");
                    condition.await();
                }
                this.cash -= cash;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            throw new RuntimeException("Error transfer");
        }
    }
}
