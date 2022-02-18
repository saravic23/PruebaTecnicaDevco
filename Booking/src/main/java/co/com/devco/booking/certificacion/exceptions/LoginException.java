package co.com.devco.booking.certificacion.exceptions;

public class LoginException extends AssertionError {

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
