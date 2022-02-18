package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ArticlesPage {
    public static final Target SEARCH=
            Target.the("Search").locatedBy("//input[@class='articles-search__searchbox-input']");

    public static final Target FOOD_ARTICLES=
            Target.the("Food Articles").locatedBy("(//a[@class='bui-f-font-display_one article-card-abbr__title '])[1]");
}
