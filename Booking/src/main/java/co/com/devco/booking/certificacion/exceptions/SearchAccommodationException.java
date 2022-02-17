package co.com.devco.booking.certificacion.exceptions;

@SuppressWarnings("serial")
public class SearchAccommodationException extends AssertionError {

    public SearchAccommodationException(String message, Throwable cause) {
        super(message, cause);
    }
}
