package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UploadPage {

    public static final Target NAME_USER =
            Target.the("Name user").located(By.xpath("//*[@class='_3W4YUuxMDL-tb5A_lwsrWR _1KFw40u5LPhyDD14xTc7s_ _3gEQDFN4oNTcw-VVgiUelz']"));

    public static final Target MANAGE_ACCOUNT =
            Target.the("manage account ").located(By.xpath("//*[contains(text(),'Gestionar cuenta')]"));

    public static final Target PERSONAL_INFORMATION =
            Target.the("Personal information").located(By.xpath("//*[contains(text(),'Datos personales')]/ancestor::div[@class='my-settings-section-card-inner']"));


   // public static final Target PERSONAL_INFORMATION =
     //       Target.the("Personal information").located(By.xpath("//*[contains(text(),'Datos personales')]/ancestor::div[@class='my-settings-section-card-inner']"));



}

