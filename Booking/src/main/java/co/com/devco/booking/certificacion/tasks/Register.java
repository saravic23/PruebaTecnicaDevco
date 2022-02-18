package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.booking.certificacion.userinterfaces.AttractionsPage.STARTING_POINT;
import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.*;
import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {
    private UserData userData;

    public Register(UserData recordData) {
        this.userData = recordData;
    }

    @Subject("rent car")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(userData.getEmail()).into(EMAIL),
                Click.on(CONTINUE_BUTTON),
                SendKeys.of(userData.getNew_password()).into(NEW_PASSWORD),
                SendKeys.of(userData.getConfirm_password()).into(CONFIRMED_PASSWORD),
                Click.on(CREATE_ACCOUNT),
                WaitUntil.the(YOUR_ACCOUNT, isVisible()));

    }

    public static Register withData(UserData userData) {
        return new Register(userData);
    }
}
