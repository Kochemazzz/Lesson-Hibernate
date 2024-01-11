package multithreading.stepikoop10;
public class Cook {
    public void turnOvenOn() {
        System.out.println("Включаю плиту");
    }
    public void turnOvenOff() {
        System.out.println("Выключаю плиту");
    }
    public void bake(String product) throws BackingException {
        System.out.println("Готовлю блюдо");
        if (product.equals("Прогорклое масло") || product.equals("Низкосортная мука")) {
            throw new BackingException(product);
        }
        System.out.println("Конец приготовления блюда");
    }
}
