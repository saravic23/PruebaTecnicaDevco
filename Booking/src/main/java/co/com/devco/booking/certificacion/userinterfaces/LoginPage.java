package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL =
            Target.the("E-mail").located(By.id("username"));

    public static final Target CONTINUE_BUTTON =
            Target.the("continue with e-mail").
                    located(By.xpath("//span[contains(string(), 'Continuar con e-mail')]"));

    public static final Target PASSWORD =
            Target.the("Password").located(By.id("password"));


    public static final Target LOGIN_BUTTON =
            Target.the("login button").
                    located(By.xpath("//*[contains(text(),'Iniciar sesión')]/ancestor::button[@class='_2emQHDWTNbBMVHK80Tj0A2 _2V1p8Jqj0mC6lhwPQD7Wm2 _3idbYJ1oAGD-sl-6gdCR2e _1Oxra6oXUcB9EXOfxAD2i2 _2b3nVYidxpTD-0_hVml1lP _2__0gVPBP36LBlyHwThlOQ']"));
}
