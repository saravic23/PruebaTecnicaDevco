package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.exceptions.SearchAccommodationException;
import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.models.AttractionData;
import co.com.devco.booking.certificacion.questions.ValidadeStartingPoint;
import co.com.devco.booking.certificacion.tasks.SeeAttractions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.ACCOMMODATION_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.ATTRACTION_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.ATTRACTIONS;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class AttractionsStepDefinitions {

    @Given("^the user is in the attractions page$")
    public void theUserIsInTheAttractionsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectOption.forThe(ATTRACTIONS));
    }


    @When("^Search for attractions on the page$")
    public void searchForAttractionsOnThePage(List<AttractionData> attractionDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeeAttractions.availables(attractionDataList.get(0)));
    }

    @Then("^You should see the starting place$")
    public void youShouldSeeTheStartingPlace() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidadeStartingPoint.ofAttraction(),
                Matchers.containsString( "Disneyland Paris, Boulevard de Parc,, Marne-la-Vallee, 77700"))
                .orComplainWith(SearchAccommodationException.class, ATTRACTION_ERROR
        ));
    }
}
