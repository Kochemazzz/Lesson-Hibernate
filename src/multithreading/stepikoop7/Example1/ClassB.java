package multithreading.stepikoop7.Example1;
public class ClassB {
    public ClassB(){
        System.out.println("Конструктор класса B");
        ClassA objA = new ClassA();
        System.out.println("dProtected = " + objA.dProtected);
        System.out.println("cDefault = " + objA.cDefault);
        System.out.println("bPublic = " + objA.bPublic);
    }
}
