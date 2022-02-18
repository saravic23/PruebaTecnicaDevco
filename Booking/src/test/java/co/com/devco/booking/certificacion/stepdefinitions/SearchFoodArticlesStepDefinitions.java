package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.models.ArticlesData;
import co.com.devco.booking.certificacion.questions.ValidadeStartingPoint;
import co.com.devco.booking.certificacion.questions.ValidateArticles;
import co.com.devco.booking.certificacion.tasks.SearchMoreArticles;
import co.com.devco.booking.certificacion.userinterfaces.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.ARTICLES_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchFoodArticlesStepDefinitions {

    @Given("^The user is on the Articles website$")
    public void theUserIsOnTheArticlesWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Scroll.to(MainPage.ARTICLES), Click.on(MainPage.ARTICLES));
    }

    @When("^Search an article about the category$")
    public void searchAnArticleAboutTheCategory(List<ArticlesData> articlesData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchMoreArticles.inThePage(articlesData.get(1)));
    }

    @Then("^he should see the articles of food$")
    public void heShouldSeeTheArticlesOfFood() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateArticles.was(),
                Matchers.is(true)).orComplainWith(SecurityException.class,ARTICLES_ERROR)
        );
    }

}
