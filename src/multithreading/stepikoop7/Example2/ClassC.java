package multithreading.stepikoop7.Example2;
import multithreading.stepikoop7.Example1.ClassA;
public class ClassC {

    public ClassC(){
        System.out.println("Конструктор класса С");
        ClassA Obja = new ClassA();
        System.out.println("bPublic = " + Obja.bPublic);
    }
}
