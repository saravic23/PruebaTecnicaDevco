package co.com.devco.booking.certificacion.models;

import java.util.GregorianCalendar;

public class AccomodationData {

    private String destiny;
    private String filter;
    private GregorianCalendar checkin;
    private GregorianCalendar checkout;

    public AccomodationData(String destiny,String filter, GregorianCalendar checkin, GregorianCalendar checkout) {
        this.destiny = destiny;
        this.filter = filter;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getDestiny() {
        return destiny;
    }
    public String getFilter() {
        return filter;
    }


    public GregorianCalendar getCheckin() {
        return checkin;
    }

    public GregorianCalendar getCheckout() {
        return checkout;
    }
}
