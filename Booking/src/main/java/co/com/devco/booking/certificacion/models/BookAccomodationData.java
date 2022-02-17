package co.com.devco.booking.certificacion.models;

public class BookAccomodationData {

    private String destiny;
    private String adults;
    private String kids;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String typeCard;
    private String cardNumber;


    public BookAccomodationData(String destiny, String adults, String kids, String name, String lastname, String email, String phone, String typeCard,
                                String cardNumber) {
        this.destiny = destiny;
        this.adults = adults;
        this.kids = kids;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.typeCard = typeCard;
        this.cardNumber = cardNumber;

    }

    public String getDestiny() {
        return destiny;
    }

    public String getAdults() {
        return adults;
    }

    public String getKids() {
        return kids;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
