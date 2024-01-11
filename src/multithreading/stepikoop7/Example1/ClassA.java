package multithreading.stepikoop7.Example1;
public class ClassA {
    private int aPrivate;
    public int bPublic;
    int cDefault;
    protected int dProtected;

    public ClassA(){
        System.out.println("Конструктор класса А");
        aPrivate = 1;
        bPublic = 2;
        cDefault = 3;
        dProtected = 4;
    }
}
