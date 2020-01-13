package by.javatr.yakovlev.task01.array.exception;

public class NullSortMethodException extends Exception {

    public NullSortMethodException() {
    }

    public NullSortMethodException(String message) {
        super(message);
    }

    public NullSortMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullSortMethodException(Throwable cause) {
        super(cause);
    }
}
