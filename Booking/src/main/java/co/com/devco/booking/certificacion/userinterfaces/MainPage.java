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
            Target.the("Date of {0}").locatedBy("//td[@data-date='{0}']");

    public static final Target DATE_RETURN =
            Target.the("Date of {0} return").locatedBy("//td[@data-date='{0}']");

    public static final Target CONTINUE = Target.the("Continua")
            .locatedBy("//*[@class='sb-searchbox-submit-col -submit-button ']");



}

