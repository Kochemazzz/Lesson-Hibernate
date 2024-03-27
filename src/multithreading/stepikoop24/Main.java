package multithreading.stepikoop24;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Animal());

    }

    public static void feedAnimals(ArrayList<? extends Cat> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }

    }
}
