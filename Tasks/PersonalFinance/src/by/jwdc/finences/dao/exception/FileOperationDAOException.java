package by.jwdc.finences.dao.exception;

public class FileOperationDAOException extends Exception {
    public FileOperationDAOException() {
    }

    public FileOperationDAOException(String message) {
        super(message);
    }

    public FileOperationDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileOperationDAOException(Throwable cause) {
        super(cause);
    }
}
