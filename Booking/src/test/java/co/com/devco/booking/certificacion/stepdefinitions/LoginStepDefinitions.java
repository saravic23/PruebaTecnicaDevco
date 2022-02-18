package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.exceptions.LoginException;
import co.com.devco.booking.certificacion.exceptions.RegisterException;
import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.questions.TheResgister;
import co.com.devco.booking.certificacion.questions.UserLogin;
import co.com.devco.booking.certificacion.tasks.Login;
import co.com.devco.booking.certificacion.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import co.com.devco.booking.certificacion.models.UserData;

import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.LOGIN_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.REGISTER_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;


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
    public void heEnterTheData(List<UserData> data) {
    OnStage.theActorInTheSpotlight().attemptsTo(Login.inThePageWith(data.get(0)));

    }

    @Then("^he should see his (.*)$")
    public void heShouldSeeHis(String name) {
      OnStage.theActorInTheSpotlight().should(seeThat(UserLogin.is("Pruebas QA"))
              .orComplainWith(LoginException.class, LOGIN_ERROR
      ));
    }

    @When("^he enter the data for the register$")
    public void heEnterTheDataForTheRegister(List<UserData> data) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Register.withData(data.get(0))
            );
    }

    @Then("^he should see in his account a message (.*)$")
    public void heShouldSeeInHisAccountAMessage(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheResgister.was(),
                containsString(message)).orComplainWith(RegisterException.class, REGISTER_ERROR

        ));
    }

}
