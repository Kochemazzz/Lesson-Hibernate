package multithreading.logger;
import java.util.Arrays;
public class Logger {
    public static Logger uniqueLogger;
    private String textL = "";
    private String sortText = "";
    public static Logger getInstance() {
        if (uniqueLogger == null) {
            uniqueLogger = new Logger();
        }
        return uniqueLogger;
    }
    public void putError(String text) {
        textL += text;
        textL += " ";
    }
    public String getErrors() {
        String[] all = textL.split(" ");
        System.out.println(Arrays.toString(all));
        for (int i = all.length - 1; i >= 0; i--) {
            sortText += all[i];
            sortText += " ";
        }
        return sortText;
    }
}