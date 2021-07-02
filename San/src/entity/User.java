package entity;

/**
 * @author jitwxs
 * @date 2021年07月01日 14:11
 */
public class User {
    /*id，username,password,datetime（用户创建时间：格式如下:yyyy-MM-dd HH:mm:ss)*/
    //编号
    private String id;
    //用户名
    private String username;
    //密码
    private String passWord;
    //用户创建时间
    private String datetime;

    public User() {
    }

    public User(String id, String username, String passWord, String datetime) {
        this.id = id;
        this.username = username;
        this.passWord = passWord;
        this.datetime = datetime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passWord='" + passWord + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}
