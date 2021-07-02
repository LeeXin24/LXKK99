package pojo;

public class User {
    //用户User id，username,password,datetime（用户创建时间：格式如下:yyyy-MM-dd HH:mm:ss)
    private String Userid;
    private String username;
    private String password;
    private String datetime;

    public User(String userid, String username, String password, String datetime) {
        Userid = userid;
        this.username = username;
        this.password = password;
        this.datetime = datetime;
    }

    public User() {

    }

    public boolean login(String name, String password) {
        return false;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

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

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "pojo.User{" +
                "Userid='" + Userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}
