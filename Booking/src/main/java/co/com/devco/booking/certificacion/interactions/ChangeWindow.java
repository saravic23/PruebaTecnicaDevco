package co.com.devco.booking.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ChangeWindow implements Interaction {
    private String title;

    public ChangeWindow(String title) {
        this.title = title;
    }

 @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver= BrowseTheWeb.as(actor).getDriver();
        Set<String> listScreen=driver.getWindowHandles();

        for(String screem:listScreen){
            driver.switchTo().window(screem);
            if (driver.getTitle().contains(title)){
                break;
            }
        }
        if (!driver.getTitle().contains(title)){
            throw new NoSuchWindowException("no tab found "
                    +"with the title " +title);
        }
        listScreen.remove(driver.getWindowHandle());
    }
    public static ChangeWindow withTitle(String title){ return Tasks.instrumented(ChangeWindow.class, title);
    }
}
