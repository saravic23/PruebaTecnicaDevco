package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.models.LoginData;
import co.com.devco.booking.certificacion.models.UploadData;
import co.com.devco.booking.certificacion.tasks.Login;
import co.com.devco.booking.certificacion.tasks.UpdateInformation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.LOGIN;

public class UploadPersonalDataStepDefinitions {


    @Given("^the user is logged in the page and is in manage my account$")
    public void theUserIsLoggedInThePageAndIsInManageMyAccount(List<LoginData> loginData) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectOption.forThe(LOGIN),
                Login.inThePageWith(loginData.get(0)));
    }

    @When("^he upload his information$")
    public void heUploadHisInformation(List<UploadData> uploadData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                UpdateInformation.inBookingWith(uploadData.get(0))

        );
    }

    @Then("^he should see the succefull message$")
    public void heShouldSeeTheSuccefullMessage() {

    }


}

