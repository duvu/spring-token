package duvu.github.securitytoken.model;

import java.io.Serializable;

/**
 * @author beou on 8/20/17 02:24
 * @version 1.0
 */
public class LoginModel implements Serializable {
    private static final long serialVersionUID = -557471128873357801L;
    private String userName;
    private String password;

    public LoginModel() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
