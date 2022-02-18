package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.AttractionData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.booking.certificacion.userinterfaces.AttractionsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeeAttractions implements Task {

    private AttractionData attractionData;

    public SeeAttractions(AttractionData attractionData) {
        this.attractionData = attractionData;
    }

    @Subject("search attractions")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESTINY_FOR_ATTRACTION),
                SendKeys.of(attractionData.getDestiny()).into(DESTINY_FOR_ATTRACTION),
                Click.on(BUTTON_SEARCH_ATTRACTION),
                Click.on(TOUR),
                WaitUntil.the(STARTING_POINT, isVisible()));

    }

    public static SeeAttractions availables(AttractionData attractionData) {
        return new SeeAttractions(attractionData);
    }
}
