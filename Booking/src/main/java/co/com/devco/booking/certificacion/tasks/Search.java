package co.com.devco.booking.certificacion.tasks;


import co.com.devco.booking.certificacion.interactions.SelectDate;
import co.com.devco.booking.certificacion.models.AccomodationData;
import co.com.devco.booking.certificacion.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.*;
import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.LOGIN_BUTTON;
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
            //    SelectDate.desired(accomodation.getCheckin(), DATE_DEPARTURE),
             //   SelectDate.desired(accomodation.getCheckin(), RETURN_DATE),
                Click.on(CONTINUE));
    }

    public static Search withOptions(AccomodationData accomodation) {
        return instrumented(Search.class, accomodation);
    }

}

