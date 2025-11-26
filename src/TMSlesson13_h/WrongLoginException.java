package TMSlesson13_h;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
}
