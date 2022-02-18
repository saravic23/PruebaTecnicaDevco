package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage {

    public static final Target DROPDOWN =
            Target.the("Dropdown").located(By.xpath("//*[@class='a5b679fa41 ']/ancestor::li[@class='c266cda126 acf4eb317b']"));

    public static final Target FILTER = Target.the("Filter").located(By.xpath("//*[@class='c266cda126']//*[contains(text(),'Distancia desde el centro de la ciudad')]"));

    public static final Target DISTANCE = Target.the("Distance").located(By.xpath("(//*[@class='e36b9d9c39']//*[@data-testid='distance'])[1]"));



}
