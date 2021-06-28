package practice.pojo;

public class Business {
    private String id;
    private String name;
    private String nick; //别称
    private String phone;//联系方式
    private String password;
    private String  IDCard;
    private static int number;

    public Business() {
       this.id=""+ ++number;
    }

    public Business( String name, String nick, String phone, String password, String IDCard) {

        this.name = name;
        this.nick = nick;
        this.phone = phone;
        this.password = password;
        this.IDCard = IDCard;
        this.id=""+ ++number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", IDCard='" + IDCard + '\'' +
                '}';
    }
}
