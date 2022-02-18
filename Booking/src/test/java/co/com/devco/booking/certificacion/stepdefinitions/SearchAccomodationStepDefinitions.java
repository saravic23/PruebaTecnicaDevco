package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.exceptions.SearchAccommodationException;
import co.com.devco.booking.certificacion.models.AccomodationData;
import co.com.devco.booking.certificacion.models.LoginData;
import co.com.devco.booking.certificacion.questions.ValidateAccomodation;
import co.com.devco.booking.certificacion.stepdefinitions.GeneralStepDefinitions;
import co.com.devco.booking.certificacion.tasks.Search;
import co.com.devco.booking.certificacion.tasks.SearchAccomodations;
import co.com.devco.booking.certificacion.utils.constants.ErrorsConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class SearchAccomodationStepDefinitions extends GeneralStepDefinitions {

    @Before
    public void config() {
        SetUp();
    }


    @Given("^The user is on the reservation website and enters the accommodation search parameters$")
    public void theUserIsOnTheReservationWebsiteAndEntersTheAccommodationSearchParameters(List<AccomodationData> accomodationData) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Search.withOptions(accomodationData.get(0)));
    }

    @When("^he enters filter Distancia desde el centro de la ciudad$")
    public void heEntersFilterDistanciaDesdeElCentroDeLaCiudad() {
       OnStage.theActorInTheSpotlight().attemptsTo(
               SearchAccomodations.inBooking()
       );

    }
    @Then("^you will see an accommodation that the first option is the closest$")
    public void youWillSeeAnAccommodationThatTheFirstOptionIsTheClosest() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateAccomodation.was(),
                Matchers.containsString( "a 0,7 km del centro")).orComplainWith(SearchAccommodationException.class, ACCOMMODATION_ERROR
        ));
    }



}
