package multithreading.stepikoop25;
public class Purchase implements Comparable<Purchase> {
    private String name;
    private int price;
    private int count;
    public Purchase(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    @Override
    public int compareTo(Purchase o) {
        return name.compareTo(o.getName());
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
    public int totalCost() {
        return price * count;
    }
    @Override
    public String toString() {
        return name + " " + price + " " + count + " " + totalCost();
    }
}
