package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarRentalPage {

    public static final Target PICK_UP_PLACE =
            Target.the("pick up place").located(By.id("ss_origin"));

    public static final Target SELECT_PICKUP_PLACE =
            Target.the("select pick up place").located(By.xpath("//*[@class='c-autocomplete__list sb-autocomplete__list -visible']"));

    public static final Target SEARCH_CAR =
            Target.the("button search").located(By.xpath("//button[@data-sb-id='main']"));

    public static final Target LABEL =
            Target.the("Label").located(By.xpath("//p[@class='bui-f-font-headline_2']"));

    public static final Target CAR_SIZE =
            Target.the("size {0}").locatedBy("//div[contains(text(),'{0}')]");

    public static final Target CAR_MODEL =
            Target.the("CAR MODEL").located(By.xpath("//h3[@class='bui-f-font-headline_3']"));
}

