package app.dto;

public class LoginDto {
    private String username;
    private String password;
    private Boolean rememberPwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRememberPwd() {
        return rememberPwd;
    }

    public void setRememberPwd(Boolean rememberPwd) {
        this.rememberPwd = rememberPwd;
    }
}
