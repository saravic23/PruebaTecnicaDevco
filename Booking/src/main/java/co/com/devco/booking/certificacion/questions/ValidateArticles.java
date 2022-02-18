package co.com.devco.booking.certificacion.questions;

import co.com.devco.booking.certificacion.userinterfaces.ArticlesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateArticles implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(ArticlesPage.FOOD_ARTICLES).viewedBy(actor).asBoolean();
    }

    public static ValidateArticles was(){
        return new ValidateArticles();
    }
}
