package multithreading.lesson8;
public class Human extends Thread {

    private CreditCard creditCard;

    public Human(CreditCard creditCard){
        this.creditCard = creditCard;
    }
    @Override
    public void run() {
        synchronized (creditCard) {
            for (int i = 0; i < 5; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Сейчас снимает деньги" + Thread.currentThread().getName());
                creditCard.takeMoney(20 + i);
            }
        }
    }
}
