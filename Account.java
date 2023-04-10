public class Account {
    private String username;
    private String password;

    public Account() {
        username = "";
        password = "";
    }

    public String get_username() {
        return username;
    }

    public void set_username(String username) {
        this.username = username;
    }

    public String get_password() {
        return password;
    }

    public void set_password(String password) {
        this.password = password;
    }
}