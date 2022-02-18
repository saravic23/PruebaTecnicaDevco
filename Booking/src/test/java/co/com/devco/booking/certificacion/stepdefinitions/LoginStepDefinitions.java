package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.questions.UserLogin;
import co.com.devco.booking.certificacion.stepdefinitions.GeneralStepDefinitions;
import co.com.devco.booking.certificacion.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import co.com.devco.booking.certificacion.models.LoginData;

import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class LoginStepDefinitions extends GeneralStepDefinitions {

    @Before
    public void config() {
        SetUp();
    }

    @Given("^the user is in the login page$")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
               SelectOption.forThe(LOGIN));

    }

    @When("^he enter the data$")
    public void heEnterTheData(List<LoginData> data) {
    OnStage.theActorInTheSpotlight().attemptsTo(Login.inThePageWith(data.get(0)));

    }

    @Then("^he should see his (.*)$")
    public void heShouldSeeHis(String name) {
      OnStage.theActorInTheSpotlight().should(seeThat(UserLogin.is("Pruebas QA")));
    }


}
