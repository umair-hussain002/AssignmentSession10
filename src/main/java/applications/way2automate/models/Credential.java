package applications.way2automate.models;

public class Credential {
    private String username;
    private String password;
    private String url;

    public Credential(String user, String pass, String url)
    {
        this.username = user;
        this.password = pass;
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
