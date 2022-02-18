package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.exceptions.RentACar;
import co.com.devco.booking.certificacion.exceptions.SearchAccommodationException;
import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.models.CarData;
import co.com.devco.booking.certificacion.questions.ValidadeCar;
import co.com.devco.booking.certificacion.questions.ValidateAccomodation;
import co.com.devco.booking.certificacion.tasks.GetCarRental;
import co.com.devco.booking.certificacion.tasks.SearchCar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.ACCOMMODATION_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.RENT_CAR_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GetCarStepDefinitios {

    @Given("^The user is on the rental page  and enters the pickup location$")
    public void theUserIsOnTheRentalPageAndEntersThePickupLocation(List<CarData> carData) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectOption.forThe(CAR),
                SearchCar.withOptions(carData.get(0)));
    }

    @When("^the user enter the filters$")
    public void theUserEnterTheFilters(List<CarData> carData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GetCarRental.inThePageWith(carData.get(0))
        );
    }

    @Then("^He should see the (.*)car$")
    public void heShouldSeeThe(String modelCar) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidadeCar.is(),
                Matchers.containsString( modelCar)).orComplainWith(RentACar.class, RENT_CAR_ERROR
        ));
    }


}
