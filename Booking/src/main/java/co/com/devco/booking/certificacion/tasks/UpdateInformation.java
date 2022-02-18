package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.LoginData;
import co.com.devco.booking.certificacion.models.UploadData;
import co.com.devco.booking.certificacion.userinterfaces.UploadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.booking.certificacion.userinterfaces.CarRentalPage.LABEL;
import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.*;
import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.LOGIN_BUTTON;
import static co.com.devco.booking.certificacion.userinterfaces.UploadPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class UpdateInformation implements Task {
    private UploadData uploadData;

    public UpdateInformation(UploadData uploadData) {
        this.uploadData = uploadData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(NAME_USER, isVisible()),
                Click.on(NAME_USER),
                Click.on(MANAGE_ACCOUNT),
                Click.on(PERSONAL_INFORMATION)
                );

    }

    public static UpdateInformation inBookingWith(UploadData uploadData) {
        return new UpdateInformation(uploadData);
    }
}
