package multithreading.stepikoop24;
public class Animal {
    public void eat() {
        System.out.println("Животное ест");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Кот ест");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
}