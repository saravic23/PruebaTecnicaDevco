package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.models.AttractionData;
import co.com.devco.booking.certificacion.userinterfaces.AttractionsPage;
import co.com.devco.booking.certificacion.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static co.com.devco.booking.certificacion.userinterfaces.AttractionsPage.*;

public class SeeAttractions implements Task {

    private AttractionData attractionData;

    public SeeAttractions(AttractionData attractionData) {
        this.attractionData = attractionData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESTINY_FOR_ATTRACTION),
                SendKeys.of(attractionData.getDestiny()).into(DESTINY_FOR_ATTRACTION)
                ,
                Click.on(BUTTON_SEARCH_ATTRACTION),
                Click.on(TOUR));

    }

    public static SeeAttractions availables(AttractionData attractionData) {
        return new SeeAttractions(attractionData);
    }
}
