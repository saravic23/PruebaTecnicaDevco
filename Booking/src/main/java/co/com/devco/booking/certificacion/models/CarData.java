package co.com.devco.booking.certificacion.models;

public class CarData {

    private String pickup;
    private String car;

    public CarData(String pickup, String car) {
        this.pickup = pickup;
        this.car = car;

    }

    public String getPickup() {
        return pickup;
    }

    public String getCar() {
        return car;
    }


}
