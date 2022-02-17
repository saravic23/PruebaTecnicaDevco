package co.com.devco.booking.certificacion.questions;

import co.com.devco.booking.certificacion.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.booking.certificacion.userinterfaces.SearchPage.*;

public class ValidateAccomodation implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(DISTANCE).viewedBy(actor).asString();
    }

    public static ValidateAccomodation was(){
        return new ValidateAccomodation();
    }
}
