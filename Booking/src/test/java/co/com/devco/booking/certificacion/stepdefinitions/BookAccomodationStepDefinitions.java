package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.models.BookAccomodationData;
import co.com.devco.booking.certificacion.questions.ValidateBook;
import co.com.devco.booking.certificacion.tasks.BookAccomodation;
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

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class BookAccomodationStepDefinitions {



    @When("^The diligence all the fields to reserve the accommodation$")
    public void theDiligenceAllTheFieldsToReserveTheAccommodation(List<BookAccomodationData> bookAccomodationList) {
        OnStage.theActorInTheSpotlight().attemptsTo(BookAccomodation.inBooking(bookAccomodationList.get(0)));
    }


    @Then("^You should see the Complete Reservation button$")
    public void youShouldSeeTheCompleteReservationButton() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateBook.was(), Matchers.is(true)));
    }


}
