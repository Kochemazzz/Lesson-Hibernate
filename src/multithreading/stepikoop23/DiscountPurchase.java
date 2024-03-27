package multithreading.stepikoop23;
public class DiscountPurchase extends Purchase {
    private int discount;
    public DiscountPurchase(String name, int price, int number, int discount) {
        super(name, price, number);
        this.discount = discount;
    }
    public DiscountPurchase() {
        this.discount = 0;
    }
    @Override
    int getCost() {
        return super.getCost() - super.getCost() * discount / 100;
    }
}