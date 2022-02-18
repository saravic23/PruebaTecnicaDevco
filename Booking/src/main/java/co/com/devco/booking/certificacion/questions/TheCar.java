package co.com.devco.booking.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.booking.certificacion.userinterfaces.CarRentalPage.*;

public class TheCar implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CAR_MODEL).viewedBy(actor).asString();

    }

    public static TheCar is() {
        return new TheCar();
    }
}
