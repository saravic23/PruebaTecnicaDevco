package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionsPage {

    public static final Target DESTINY_FOR_ATTRACTION =
            Target.the("Destiny").located(By.xpath("//input[@type='search']"));

    public static final Target BUTTON_SEARCH_ATTRACTION =
            Target.the("button search").located(By.xpath("//button[@type='submit']"));

    public static final Target TOUR=
            Target.the("Attraction").located(By.xpath("//*[contains(text(),'Entrada de un día a Disneyland® París')]"));

    public static final Target STARTING_POINT=
            Target.the("Starting point").located(By.xpath("//*[@class='Box-module__base___320KW']"));

}

