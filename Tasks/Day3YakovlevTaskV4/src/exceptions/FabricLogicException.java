package exceptions;

public class FabricLogicException extends Exception {

    public FabricLogicException() {
    }

    public FabricLogicException(String message) {
        super(message);
    }

    public FabricLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public FabricLogicException(Throwable cause) {
        super(cause);
    }
}
