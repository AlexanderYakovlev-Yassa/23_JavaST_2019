package exceptions;

public class BasketLogicException extends Exception {
    public BasketLogicException() {
    }

    public BasketLogicException(String message) {
        super(message);
    }

    public BasketLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketLogicException(Throwable cause) {
        super(cause);
    }
}
