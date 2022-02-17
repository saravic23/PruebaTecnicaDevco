package co.com.devco.booking.certificacion.questions;

import static co.com.devco.booking.certificacion.userinterfaces.MainPage.PROFILE_NAME;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UserLogin implements Question<Boolean> {
    private String name;

    public UserLogin(String name) {
        this.name = name;
    }

    public static UserLogin is(String name) {

        return new UserLogin(name);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return Text.of(PROFILE_NAME).viewedBy(actor).asString().contains(name);
    }


}
