package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.*;

public class Login implements Task {
    private UserData userData;

    public Login(UserData recordData) {
        this.userData = recordData;
    }

    @Subject("user login")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        SendKeys.of(userData.getEmail()).into(EMAIL),
                        Click.on(CONTINUE_BUTTON),
                        SendKeys.of(userData.getPassword()).into(PASSWORD),
                        Click.on(LOGIN_BUTTON));

    }

    public static Login inThePageWith(UserData userData) {
        return new Login(userData);
    }
}
