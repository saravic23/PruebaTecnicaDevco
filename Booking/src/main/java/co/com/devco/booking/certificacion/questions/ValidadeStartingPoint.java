package co.com.devco.booking.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.booking.certificacion.userinterfaces.AttractionsPage.*;


public class ValidadeStartingPoint implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(STARTING_POINT).viewedBy(actor).asString();

    }

    public static ValidadeStartingPoint ofAttraction() {
        return new ValidadeStartingPoint();
    }
}
