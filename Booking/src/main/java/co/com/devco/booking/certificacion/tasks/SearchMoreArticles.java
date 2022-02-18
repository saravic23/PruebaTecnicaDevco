package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.ArticlesData;
import co.com.devco.booking.certificacion.userinterfaces.ArticlesPage;
import co.com.devco.booking.certificacion.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchMoreArticles implements Task {

    public ArticlesData articlesData;

    public SearchMoreArticles(ArticlesData articlesData) {
        this.articlesData = articlesData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ArticlesPage.SEARCH),
                Click.on(ArticlesPage.SEARCH),
                SendKeys.of(articlesData.getCategory()).into(ArticlesPage.SEARCH),
                Hit.the(Keys.ENTER).into(ArticlesPage.SEARCH));
    }
    public static SearchMoreArticles inThePage(ArticlesData articlesData){
        return instrumented(SearchMoreArticles.class,articlesData);
    }


    }
