package co.com.devco.booking.certificacion.utils.constants;

public class ErrorsConstants {


  public static final String ACCOMMODATION_ERROR = "Distances less than 1 km are not shown";
  public static final String ATTRACTION_ERROR = "Starting points do not match";
  public static final String RENT_CAR_ERROR = "Error when checking the car ";
  public static final String REGISTER_ERROR = "Error when try to create the user ";
  public static final String LOGIN_ERROR = "Error when try to sing in ";

  private ErrorsConstants() {
    throw new IllegalStateException("Utility class");
  }
}
