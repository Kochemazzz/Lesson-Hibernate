package multithreading.stepikoop5;
public class Main {
    public static void main(String[] args) {
        Welcomeableout welcomeableout = new InnerInterface();
        InnerInterface.Welcomeable welcomeable = new OuterInterface();
        welcomeableout.printHello();
        welcomeable.printHello();

    }
}
