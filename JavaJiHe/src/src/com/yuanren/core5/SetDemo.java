package src.com.yuanren.core5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        /**
         *  无存储顺序, 不可重复
         */

        /*Set<String> set=new HashSet<>();
        set.add("张三");
        set.add("12421");
        System.out.println(set);*/

        Set<User>  set=new HashSet<>();
        set.add(new User("张三","123"));
        set.add(new User("李四","2334"));
        set.add(new User("完好无","768"));
        set.add(new User("timi","7888"));
        set.add(new User("张三","123"));

        System.out.println(set);

        for (User  us: set) {
            System.out.println(us.toString());
        }

        Iterator<User> iterator = set.iterator();

    }
}

class  User{

    private String  name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {  //User.class   Student.class

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}