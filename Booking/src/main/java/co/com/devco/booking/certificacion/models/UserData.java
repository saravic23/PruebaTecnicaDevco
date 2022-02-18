package co.com.devco.booking.certificacion.models;

public class UserData {

    private String email;
    private String password;
    private String  name;
    private String  new_password;
    private String  confirm_password;


    public UserData(String email, String password, String name, String new_password, String confirm_password) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.new_password = new_password;
        this.confirm_password = confirm_password;
    }

    public String getNew_password() {
        return new_password;
    }

    public String getConfirm_password() {
        return confirm_password;
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
