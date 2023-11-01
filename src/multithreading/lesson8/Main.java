package multithreading.lesson8;
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);
        for (int i = 0; i <2 ; i++) {
            new Human(creditCard).start();
        }
    }
}
