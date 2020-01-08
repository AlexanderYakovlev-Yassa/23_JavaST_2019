package by.jwdc.finences.dao.exception;

public class OperationDAOException extends Exception {
    public OperationDAOException() {
    }

    public OperationDAOException(String message) {
        super(message);
    }

    public OperationDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationDAOException(Throwable cause) {
        super(cause);
    }
}
