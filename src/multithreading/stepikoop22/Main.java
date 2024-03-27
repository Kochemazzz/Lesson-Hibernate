package multithreading.stepikoop22;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Animal());
        ArrayList<Dog> svora = new ArrayList<Dog>();
        svora.add(new Dog());
        svora.add(new Dog());
        feedAnimals(svora);
        feedAnimals(animalList);
    }

    public static void feedAnimals(ArrayList<? extends Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }
}