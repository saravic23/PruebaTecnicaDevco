package co.com.devco.booking.certificacion.utils.constants;

public class ErrorsConstants {

  public static final String ERROR_YEAR = "The date cannot be earlier than the current one (check year)";
  public static final String ERROR_MONTH = "The date cannot be earlier than the current one (check month)";
  public static final String ERROR_DAY = "The date cannot be earlier than the current one (check day)";
  public static final String ACCOMMODATION_ERROR = "Distances less than 1 km are not shown";
  public static final String ATTRACTION_ERROR = "Starting points do not match";

  private ErrorsConstants() {
    throw new IllegalStateException("Utility class");
  }
}
