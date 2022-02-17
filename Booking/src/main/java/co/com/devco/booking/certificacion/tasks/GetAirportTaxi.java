package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.userinterfaces.GetTaxiPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.devco.booking.certificacion.userinterfaces.GetTaxiPage.*;


public class GetAirportTaxi implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("ibis Medellin").into(PICKUP_LOCATION),
                Hit.the(Keys.ENTER).into(PICKUP_LOCATION),
                Click.on(CONFIRM),
                SendKeys.of("Hotel Dann Carlton Belfort Medellin").into(DESTINY_LOCATION),
                Hit.the(Keys.ENTER).into(DESTINY_LOCATION),
                Click.on(CONFIRM),
                Click.on(SEARCH));
        actor.attemptsTo(
                // Poner una espera
                Scroll.to(PASSENGER_DATA),
                SelectFromOptions.byValue("Srta.").from(SRTA),
                SendKeys.of("Sara").into(FIRST_NAME),
                SendKeys.of("Padilla").into(LAST_NAME)
        );

    }

    public static GetAirportTaxi inThePageWith() {
        return new GetAirportTaxi();
    }
}
