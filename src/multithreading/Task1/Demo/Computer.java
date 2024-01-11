package multithreading.Task1.Demo;
import multithreading.Task1.Elements.Keyboard;
import multithreading.Task1.Elements.Monitor;
import multithreading.Task1.Elements.Mouse;

import java.lang.management.MonitorInfo;
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor){
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
    public void show(){
        System.out.println(keyboard.getName() +" "+ mouse.getName() + " " + monitor.getName());
    }
}
