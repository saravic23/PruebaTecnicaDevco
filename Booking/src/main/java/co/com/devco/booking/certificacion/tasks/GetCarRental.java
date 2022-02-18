package co.com.devco.booking.certificacion.tasks;
import co.com.devco.booking.certificacion.models.CarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.devco.booking.certificacion.userinterfaces.CarRentalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GetCarRental implements Task {

    private CarData carData;

    public GetCarRental(CarData carData) {
        this.carData = carData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL, isEnabled()),
                Click.on(CAR_SIZE.of(carData.getCar())));

    }

    public static GetCarRental inThePageWith(CarData carData) {
        return  instrumented(GetCarRental.class,carData);
    }
}
