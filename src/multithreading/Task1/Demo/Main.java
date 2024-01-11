package multithreading.Task1.Demo;
import multithreading.Task1.Elements.Keyboard;
import multithreading.Task1.Elements.Monitor;
import multithreading.Task1.Elements.Mouse;
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(),new Mouse(), new Monitor());
        computer.show();
    }
}
