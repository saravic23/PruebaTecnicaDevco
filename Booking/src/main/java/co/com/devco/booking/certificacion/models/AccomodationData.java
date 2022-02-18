package co.com.devco.booking.certificacion.models;


public class AccomodationData {

    private String destiny;
    private String filter;
    private String checkin;
    private String checkout;

    public AccomodationData(String destiny, String filter, String checkin, String checkout) {
        this.destiny = destiny;
        this.filter = filter;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getDestiny() {
        return destiny;
    }

    public String getFilter() {
        return filter;
    }


}
