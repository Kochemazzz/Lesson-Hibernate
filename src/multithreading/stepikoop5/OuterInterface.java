package multithreading.stepikoop5;
public class OuterInterface implements InnerInterface.Welcomeable {
}
interface Welcomeableout{
    default void printHello(){
        System.out.println("Hello, I'm outer interface");
    }
}