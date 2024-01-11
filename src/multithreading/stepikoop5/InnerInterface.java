package multithreading.stepikoop5;
public class InnerInterface implements Welcomeableout {
    interface Welcomeable{
        default void printHello(){
            System.out.println("Hello, I'm inner interface");
        }
    }
}

