package co.com.devco.booking.certificacion.stepdefinitions;

import co.com.devco.booking.certificacion.exceptions.RentCarException;
import co.com.devco.booking.certificacion.interactions.SelectOption;
import co.com.devco.booking.certificacion.models.CarData;
import co.com.devco.booking.certificacion.questions.TheCar;
import co.com.devco.booking.certificacion.tasks.GetCarRental;
import co.com.devco.booking.certificacion.tasks.Rent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.devco.booking.certificacion.utils.constants.ErrorsConstants.RENT_CAR_ERROR;
import static co.com.devco.booking.certificacion.utils.constants.ProductConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class RentCarStepDefinitios {

    @Given("^The user is on the rental page  and enters the pickup location$")
    public void theUserIsOnTheRentalPageAndEntersThePickupLocation(List<CarData> carData) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectOption.forThe(CAR),
                Rent.aCarWith(carData.get(0)));
    }

    @When("^the user enter the filters$")
    public void theUserEnterTheFilters(List<CarData> carData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GetCarRental.inThePageWith(carData.get(0))
        );
    }

    @Then("^He should see the (.*)car$")
    public void heShouldSeeThe(String modelCar) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheCar.is(),
                containsString(modelCar)).orComplainWith(RentCarException.class, RENT_CAR_ERROR
        ));
    }


}
