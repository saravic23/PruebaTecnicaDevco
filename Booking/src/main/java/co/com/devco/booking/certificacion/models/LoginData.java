package co.com.devco.booking.certificacion.models;

public class LoginData {

    private String email;
    private String password;
    private String  name;

    public LoginData(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}