package co.com.devco.booking.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookPage {

    public static final Target BOOK_NOW =
            Target.the("Book now").located(By.xpath("//button[@id='hp_book_now_button']"));

    public static final Target AMOUNT =
            Target.the("Amount").located(By.xpath("(//select[@class='hprt-nos-select js-hprt-nos-select'])[2]"));

    public static final Target RESERVE =
            Target.the("Reserve").located(By.xpath("(//button[@type='submit'])[3]"));

    public static final Target NAME =
            Target.the("input nombre").located(By.xpath("//input[@id='firstname']"));

    public static final Target LASTNAME =
            Target.the("Input lastname").located(By.xpath("//input[@id='lastname']"));

    public static final Target EMAIL =
            Target.the("Email").located(By.xpath("//input[@id='email']"));

    public static final Target CONFIRM_EMAIL =
            Target.the("confirm email").located(By.xpath("//input[@id='email_confirm']"));

    public static final Target TIME_ARRIVE =
            Target.the("time arrive").located(By.xpath("//select[@id='checkin_eta_hour']"));

    public static final Target LAST_DATA =
            Target.the("Last dates").located(By.xpath("//button[@type='submit']/ancestor::div[@class='bui-group__item']"));

    public static final Target PHONE =
            Target.the("phone number").located(By.xpath("//input[@id='phone']"));

    public static final Target COMPLETE_RESERVE =
            Target.the("complete reserve").located(By.xpath("//button[@type='submit']/ancestor::div[@class='bui-group__item']"));
}