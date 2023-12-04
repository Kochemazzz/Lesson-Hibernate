package multithreading.lesson9;
public class Product {
    private static volatile Product instance;
    private Product() {
    }
    public static Product getInstance() {// #3
        if (instance == null) {
            synchronized (Product.class) {//если объект еще не создан
                instance = new Product();    //создать новый объект
            }
        }
        return instance;        // вернуть ранее созданный объект
    }
    private boolean flag;
    public boolean isProduced() {
     return flag;
    }
    public boolean isConsumred() {
        return !flag;
    }

    public void produce(){
        System.out.println("Изготовлен продукт");
        this.flag = true;
    }
    public void consurme(){
        System.out.println("Продукт употреблен");
            this.flag = false;
    }

}
