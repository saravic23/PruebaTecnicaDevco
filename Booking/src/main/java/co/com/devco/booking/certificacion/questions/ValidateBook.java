package co.com.devco.booking.certificacion.questions;

import co.com.devco.booking.certificacion.userinterfaces.BookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

public class ValidateBook implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(BookPage.COMPLETE_RESERVE).viewedBy(actor).asBoolean();
    }

    public static ValidateBook was(){
        return new ValidateBook();
    }
}


