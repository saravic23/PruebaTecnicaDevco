package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.AccomodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;

import static co.com.devco.booking.certificacion.userinterfaces.MainPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Search implements Task {

    private AccomodationData accomodation;

    public Search(AccomodationData accomodation) {
        this.accomodation = accomodation;
    }

    @Step("Search Accomodation")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of(accomodation.getDestiny()).into(DESTINY),
                Click.on(CONFIRM_DESTINY),
              Click.on(DATE_DEPARTURE.of(accomodation.getCheckin())),
              Click.on(DATE_RETURN.of(accomodation.getCheckout())),
                Click.on(CONTINUE));
    }

    public static Search withOptions(AccomodationData accomodation) {
        return instrumented(Search.class, accomodation);
    }

}

