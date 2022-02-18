package co.com.devco.booking.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.booking.certificacion.userinterfaces.LoginPage.*;

public class TheResgister implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(YOUR_ACCOUNT).viewedBy(actor).asString();

    }

    public static TheResgister was() {
        return new TheResgister();
    }
}
