package exceptions;

public class IncorrectProductNameException extends AssertionError{

    public IncorrectProductNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
