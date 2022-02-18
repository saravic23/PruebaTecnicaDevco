package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.CarData;
import co.com.devco.booking.certificacion.userinterfaces.CarRentalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.booking.certificacion.userinterfaces.CarRentalPage.*;
import static co.com.devco.booking.certificacion.userinterfaces.MainPage.OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchCar implements Task {

    private CarData carData;

    public SearchCar(CarData carData) {
        this.carData = carData;
    }

    @Step("Search card")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of(carData.getPickup()).into(PICK_UP_PLACE),
                Click.on(SELECT_PICKUP_PLACE),
                Click.on(SEARCH_CAR)
                );

    }

    public static SearchCar withOptions(CarData carData) {
        return instrumented(SearchCar.class, carData);
    }

}

