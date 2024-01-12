package multithreading.stepikoop11;
public class TooManyCarsException extends Exception {
    public TooManyCarsException() {
    }
    public TooManyCarsException(String message) {
        super(message);
    }
    public TooManyCarsException(String message, Throwable cause) {
        super(message, cause);
    }
}
