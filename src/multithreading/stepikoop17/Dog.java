package multithreading.stepikoop17;
public class Dog {
    private String name;
    private String breed;
    private Collar collar;
    public Dog(String name, String breed,String color, double size ) {
        this.name = name;
        this.breed = breed;
        this.collar = new Collar(color,size);
    }
    public int CompareTo(Dog two) {
        if (this.collar.getSize() > two.collar.getSize()) {
            System.out.println("Первая собака больше");
            return 1;
        } else if (this.collar.getSize() < two.collar.getSize()) {
            System.out.println("Вторая собака больше");
            return -1;
        } else {
            System.out.println("Собаки одинакового размера");
            return 0;
        }
    }
    private class Collar{
        private String color;
        private double size;
        public Collar(String color, double size) {
            this.color = color;
            this.size = size;
        }
        public double getSize() {
            return size;
        }
    }
}
