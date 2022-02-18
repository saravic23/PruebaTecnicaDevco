package co.com.devco.booking.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.booking.certificacion.userinterfaces.CarRentalPage.*;

public class ValidadeCar implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CAR_MODEL).viewedBy(actor).asString();

    }

    public static ValidadeCar is() {
        return new ValidadeCar();
    }
}
