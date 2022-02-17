package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import co.com.devco.booking.certificacion.userinterfaces.MainPage;

import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.*;

public class Login implements Task {
    private LoginData loginData;

    public Login(LoginData recordData) {
        this.loginData = recordData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        SendKeys.of(loginData.getEmail()).into(EMAIL),
                        Click.on(CONTINUE_BUTTON),
                        SendKeys.of(loginData.getPassword()).into(PASSWORD),
                        Click.on(LOGIN_BUTTON));

    }

    public static Login inThePageWith(LoginData loginData) {
        return new Login(loginData);
    }
}
