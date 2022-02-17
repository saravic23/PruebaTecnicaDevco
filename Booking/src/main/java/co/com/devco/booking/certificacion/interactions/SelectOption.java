package co.com.devco.booking.certificacion.interactions;

import co.com.devco.booking.certificacion.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.booking.certificacion.userinterfaces.MainPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectOption implements Interaction {

    private String module;

    public SelectOption(String module) {
        this.module = module;
    }

    public static SelectOption forThe(String module) {
        return Tasks.instrumented(SelectOption.class, module);
    }

    @Step("{0} Select the modulo of #module")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPTION.of(module), isVisible()),
                Click.on(OPTION.of(module)));
    }
}
