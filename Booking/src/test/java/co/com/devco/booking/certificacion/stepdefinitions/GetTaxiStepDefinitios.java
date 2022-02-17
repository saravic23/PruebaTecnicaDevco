package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.tasks.GetAirportTaxi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.LOGIN;
import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.TAXY;

public class GetTaxiStepDefinitios {

    @Given("^The user in the taxy page$")
    public void theUserInTheTaxyPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectOption.forThe(TAXY));
    }

    @When("^Fill out the form to book a taxi$")
    public void fillOutTheFormToBookATaxi() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GetAirportTaxi.inThePageWith()

        );
    }

    @Then("^Should see something$")
    public void shouldSeeSomething() {

    }


}
