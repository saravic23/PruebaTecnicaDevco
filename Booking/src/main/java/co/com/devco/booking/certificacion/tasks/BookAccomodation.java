package co.com.devco.booking.certificacion.tasks;

import co.com.devco.booking.certificacion.interactions.ChangeWindow;
import co.com.devco.booking.certificacion.models.BookAccomodationData;

import co.com.devco.booking.certificacion.userinterfaces.BookPage;
import co.com.devco.booking.certificacion.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.devco.booking.certificacion.userinterfaces.BookPage.*;
import static co.com.devco.booking.certificacion.userinterfaces.MainPage.*;
import static co.com.devco.booking.certificacion.userinterfaces.SearchPage.*;

public class BookAccomodation implements Task {
    private BookAccomodationData bookAccomodation;

    public BookAccomodation(BookAccomodationData bookAccomodation1) {
        this.bookAccomodation = bookAccomodation1;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HOTEL),
                Click.on(SEE_AVABILITY));
        actor.attemptsTo(ChangeWindow.withTitle("Hotel Ayenda Marckia 1901"));
        actor.attemptsTo(Click.on(BOOK_NOW),
                SelectFromOptions.byValue("1").from(AMOUNT));
        actor.attemptsTo(Click.on(RESERVE));
        actor.attemptsTo(SendKeys.of(bookAccomodation.getName()).into(NAME),
                SendKeys.of(bookAccomodation.getLastname()).into(LASTNAME),
                SendKeys.of(bookAccomodation.getEmail()).into(EMAIL),
                Scroll.to(CONFIRM_EMAIL),
                SendKeys.of(bookAccomodation.getEmail()).into(CONFIRM_EMAIL),
                Scroll.to(TIME_ARRIVE),
                SelectFromOptions.byValue("-1").from(TIME_ARRIVE),
                Click.on(LAST_DATA),
                SendKeys.of(bookAccomodation.getPhone()).into(PHONE),
                Scroll.to(COMPLETE_RESERVE));


    }

    public static BookAccomodation inBooking(BookAccomodationData accomodationData) {
        return new BookAccomodation(accomodationData);
    }
}
