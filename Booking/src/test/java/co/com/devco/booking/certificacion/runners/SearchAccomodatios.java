package co.com.devco.booking.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_accommodation.feature",
        glue = "co.com.devco.booking.certificacion.stepdefinitions.search",
        snippets = SnippetType.CAMELCASE)
public class SearchAccomodatios {
}
