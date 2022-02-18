package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.CarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;

import static co.com.devco.booking.certificacion.userinterfaces.CarRentalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Rent implements Task {

    private CarData carData;

    public Rent(CarData carData) {
        this.carData = carData;
    }

    @Step("Search a rent car")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of(carData.getPickup()).into(PICK_UP_PLACE),
                Click.on(SELECT_PICKUP_PLACE),
                Click.on(SEARCH_CAR));

    }

    public static Rent aCarWith(CarData carData) {
        return instrumented(Rent.class, carData);
    }

}

