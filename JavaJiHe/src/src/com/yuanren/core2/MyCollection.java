package src.com.yuanren.core2;

import com.yuanren.core.User;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollection {


    public static void main(String[] args) {

        Collection<String> con = new ArrayList<>();
        con.add("中国航三分");
        Collection<User> con2 = new ArrayList<>();
        con2.add(new User("李四光", 456));
        con2.add(new User("李四光2", 456));
        con2.add(new User("李四光3", 456));

        System.out.println(con2);

        /*for (User user : con2) {
            System.out.println(user.toString());
        }*/



    }
}
