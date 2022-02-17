package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionsPage {


    public static final Target GENERAL_ENTRANCE =
            Target.the("filter turs").located(By.xpath("(//h3[contains(string(), 'Entrada general')])"));

    public static final Target DESTINY_FOR_ATTRACTION =
            Target.the("Destiny").located(By.xpath("//input[@type='search']"));

    public static final Target BUTTON_SEARCH_ATTRACTION =
            Target.the("button search").located(By.xpath("//button[@type='submit']"));

    public static final Target SELECT=
            Target.the("Select").located(By.xpath("//button[@data-testid='select-ticket']"));

    public static final Target TICKETS =
            Target.the("Tickets").located(By.xpath("(//button[@data-testid='add-ticket'])[1]"));

    public static final Target NEXT =
            Target.the("Button next").located(By.xpath("//button[@data-testid='select-ticket']"));

    public static final Target PAYMENT=
            Target.the("Payment").located(By.xpath("(//div[contains(string(), 'Total')])[@class='Text-module__root--variant-small_1___3WXLo Text-module__root--color-neutral_alt___2Ox8l']"));


    public static final Target TOUR=
            Target.the("Attraction").located(By.xpath("//*[contains(text(),'Entrada de un día a Disneyland® París')]"));

    public static final Target STARTING_POINT=
            Target.the("Starting point").located(By.xpath("//*[@class='Box-module__base___320KW']"));



}

