package exceptions;

public class IncorrectSuccessfulMessageException extends AssertionError{

    public IncorrectSuccessfulMessageException(String message, Throwable cause) {
        super(message, cause);
    }
}