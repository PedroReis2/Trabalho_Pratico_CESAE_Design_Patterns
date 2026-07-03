package Models;

public class Login {
    private String username;
    private String password;
    private String accessType;

    public Login(String username, String password, String accessType) {
        this.username = username;
        this.password = password;
        this.accessType = accessType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccessType() {
        return accessType;
    }
}
