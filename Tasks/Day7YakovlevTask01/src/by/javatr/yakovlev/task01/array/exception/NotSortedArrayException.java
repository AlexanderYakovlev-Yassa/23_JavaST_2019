package by.javatr.yakovlev.task01.array.exception;

public class NotSortedArrayException extends Exception {

    public NotSortedArrayException() {
    }

    public NotSortedArrayException(String message) {
        super(message);
    }

    public NotSortedArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSortedArrayException(Throwable cause) {
        super(cause);
    }
}
