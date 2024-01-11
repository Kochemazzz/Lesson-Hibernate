package multithreading.stepikoop10;
public class BackingException extends Exception{
    public BackingException() {
    }
    public BackingException(String message) {
        super(message);
    }
    public BackingException(String message, Throwable cause) {
        super(message, cause);
    }
    public BackingException(Throwable cause) {
        super(cause);
    }
}
