package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GetTaxiPage {

    public static final Target AIRPORT_TAXIS =
            Target.the("Airport taxis").located(By.xpath("(//a[@class='bui-tab__link'])[4]"));

    public static final Target PICKUP_LOCATION =
            Target.the("Pickup location").located(By.xpath("//input[@id='pickupLocation']"));

    public static final Target DESTINY_LOCATION =
            Target.the("Destiny location").located(By.xpath("//input[@id='dropoffLocation']"));

    public static final Target SEARCH =
            Target.the("Search").located(By.xpath("(//button[@name='searchButton'])[@type='submit'][1]"));

    public static final Target PASSENGER_DATA =
            Target.the("Passenger data").located(By.xpath("//h1[contains(string(), 'Datos del pasajero')]"));

    public static final Target SRTA=
            Target.the("Srta").located(By.xpath("//select[@class='tx-c-passenger-details__title-field-input gb-o-input--select gb-o-input']"));

    public static final Target FIRST_NAME=
            Target.the("First name").located(By.xpath("//input[@name='firstName']"));

    public static final Target LAST_NAME =
            Target.the("Last name").located(By.xpath("//input[@name='lastName']"));


    public static final Target CONFIRM =
            Target.the("Confirm ").located(By.xpath("//*[@class='rw-autocomplete__item-title ui-clyde gb-u-bold gb-u-m0']"));


}
