package by.javatr.yakovlev.task01.array.exception;

public class NullArrayException extends Exception {

    public NullArrayException() {
    }

    public NullArrayException(String message) {
        super(message);
    }

    public NullArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullArrayException(Throwable cause) {
        super(cause);
    }
}
