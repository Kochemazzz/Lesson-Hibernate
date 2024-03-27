package multithreading.stepikoop23;
public class Purchase {
    private String name;
    private int price;
    private int number;

    public Purchase(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public Purchase() {
    }

    int getCost() {
        return price * number;
    }
}
