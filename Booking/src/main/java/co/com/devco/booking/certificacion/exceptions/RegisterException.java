package co.com.devco.booking.certificacion.exceptions;

public class RegisterException extends AssertionError {

    public RegisterException(String message, Throwable cause) {
        super(message, cause);
    }
}
