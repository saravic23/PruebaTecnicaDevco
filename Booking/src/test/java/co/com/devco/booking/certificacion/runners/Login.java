package co.com.devco.booking.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "co.com.devco.booking.certificacion.stepdefinitions.login",
        snippets = SnippetType.CAMELCASE)
public class Login {
}
