package multithreading.queue;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws QueueException {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(scanner.nextInt());
        int choice;
        char sim;
        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sim = (char) scanner.nextInt();
                    queue.add(sim);
                    queue.print();
                    break;
                case 2:
                    sim = queue.poll();
                    System.out.println("Извлечено: " + (int)sim);
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.clear();
                    break;
                default:
                    return;// окончание программы
            }
        }
    }
}
