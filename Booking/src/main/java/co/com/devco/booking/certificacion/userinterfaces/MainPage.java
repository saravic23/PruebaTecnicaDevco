package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {


    public static final Target OPTION = Target.the("Option {0}")
            .locatedBy("//*[contains(text(),'{0}')]");

    public static final Target PROFILE_NAME=
            Target.the("Profile name").located(By.id("profile-menu-trigger--title"));

    public static final Target DESTINY=
            Target.the("Destiny").located(By.xpath("//input[@id='ss']"));

    public static final Target CONFIRM_DESTINY=
            Target.the("confirm Destiny").located(By.xpath("//span[@class='search_hl_name']"));


    public static final Target DATE_DEPARTURE =
            Target.the("Date of departure").located(By.xpath("(//*[@class='bui-calendar__dates'])[1]"));

    public static final Target BUTTON_BACK =
            Target.the("button return").located(By.xpath("//div[@data-placeholder='Fecha de salida']"));

    public static final Target RETURN_DATE =
            Target.the("return date").located(By.xpath("(//*[@class='bui-calendar__dates'])[2]\")"));

    public static final Target BUTTON_ATTRACTIONS =
            Target.the("Button attractions").located(By.xpath("//span[contains(string(), 'Atracciones')]"));


    public static final Target FIELD_START_DATE = Target.the("Field first date date1").located(By.id("date1"));

    public static final Target FIELD_END_DATE = Target.the("Field second date d2-btn").located(By.id("d2-btn"));

    public static final Target BUTTON_NEXT_MONTH = Target.the("Button next month")
            .locatedBy("//*[@aria-labelledby='nextMonth-title']//ancestor::button");

    public static final Target FIELD_DAY = Target.the("Field day")
            .locatedBy("//button[@aria-label='{0}']");

    public static final Target CONTINUE = Target.the("Continua")
            .locatedBy("//*[@class='sb-searchbox-submit-col -submit-button ']");



}

