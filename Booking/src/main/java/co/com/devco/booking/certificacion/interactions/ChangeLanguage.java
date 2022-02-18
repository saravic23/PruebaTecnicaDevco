package co.com.devco.booking.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.booking.certificacion.userinterfaces.MainPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChangeLanguage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(LANGUAGE, isVisible()),
                Click.on(LANGUAGE), Click.on(LANGUAGE_ES.of("Español"))
        );

    }


    public static ChangeLanguage page() {
        return Tasks.instrumented(ChangeLanguage.class);
    }
}
