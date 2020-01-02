package by.jwdc.finences.dao.exception;

public class FileUserDAOException extends Exception {

    public FileUserDAOException() {
    }

    public FileUserDAOException(String message) {
        super(message);
    }

    public FileUserDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUserDAOException(Throwable cause) {
        super(cause);
    }
}
