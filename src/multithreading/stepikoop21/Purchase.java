package multithreading.stepikoop21;
import java.util.Objects;
public class Purchase {
    private String Product;
    private int price;
    private int count;

    public Purchase(String Product,int price, int count){
        this.Product = Product;
        this.price = price;
        this.count = count;
    }


    public String getProduct() {
        return Product;
    }
    public void setProduct(String product) {
        Product = product;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return price == purchase.price && Objects.equals(Product, purchase.Product);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Product, price);
    }
    @Override
    public String toString() {
        return  Product +";" + price +";"+ count;
    }
}
