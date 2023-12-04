package multithreading.stepikoop2;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("ERROR");
            System.exit(0);
        }
        Purchase[] purchases = new Purchase[size];
        int i = 0;
        for (Purchase purchase : purchases) {
            purchase = new Purchase(new Commodity(scanner.next(), scanner.nextInt()), scanner.nextInt());
            purchases[i] = purchase;
            i++;
        }
        int max = purchases[0].getCost();
        for (Purchase purchase : purchases) {
            if (max <= purchase.getCost()) {
                max = purchase.getCost();
            }
        }
        for (Purchase purchase : purchases) {
            if(max == purchase.getCost()){
                System.out.println(purchase);
            }
        }
    }
}
class Commodity {
    private String productName;
    private int price;
    public Commodity(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setPrice(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public void show() {
        System.out.println("Наименование товара: " + productName);
        System.out.println("Цена товара: " + price);
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return productName + ';' + price;
    }
    //put your code here
}
class Purchase {
    private Commodity commodity;
    private int countProducts;
    public Purchase(Commodity commodity, int countProducts) {
        this.commodity = commodity;
        this.countProducts = countProducts;
    }
    public Purchase() {
    }
    public int getCost() {
        int cost = commodity.getPrice() * countProducts;
        return cost;
    }
    public void show() {
        System.out.println("Количество: " + countProducts);
        System.out.println("Стоимость покупки: " + getCost());
    }
    @Override
    public String toString() {
        return commodity.getProductName() + ";" + commodity.getPrice() + ";" + countProducts + ";" + getCost();
    }
}