package exceptions;

public class IncorrectPricesException extends AssertionError{

    public IncorrectPricesException(String message, Throwable cause) {
        super(message, cause);
    }
}
