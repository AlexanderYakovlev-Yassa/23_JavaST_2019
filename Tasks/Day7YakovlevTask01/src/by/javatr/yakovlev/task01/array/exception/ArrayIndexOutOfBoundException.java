package by.javatr.yakovlev.task01.array.exception;

public class ArrayIndexOutOfBoundException extends Exception{
    public ArrayIndexOutOfBoundException() {
    }

    public ArrayIndexOutOfBoundException(String message) {
        super(message);
    }

    public ArrayIndexOutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIndexOutOfBoundException(Throwable cause) {
        super(cause);
    }
}
