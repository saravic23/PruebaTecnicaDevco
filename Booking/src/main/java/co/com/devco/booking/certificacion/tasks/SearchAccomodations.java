package co.com.devco.booking.certificacion.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.devco.booking.certificacion.userinterfaces.SearchPage.*;

public class SearchAccomodations implements Task {

    @Subject("search acommodation filter")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               Click.on(DROPDOWN),
                Click.on(FILTER));
    }

    public static SearchAccomodations inBooking(){
        return new SearchAccomodations();
    }
}

