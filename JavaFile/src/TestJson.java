import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TestJson {


    public static void main(String[] args) {

        String str = "{\"name\":\"张三\",\"age\":22,\"address\":\"丹霞区\"}";
        User  user = JSONObject.parseObject(str,User.class);  //吧json字符串转换成对象
        // System.out.println(user);
        File file = new File("JavaFile/user.json");
       /* String s = JSONObject.toJSONString(user); //把对象转换成json字符串
        try {
            FileWriter  fileWriter=new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader  fileReader= null;
        try {
            fileReader = new FileReader(file);
            char[] chars=new char[(int)file.length()];
            fileReader.read(chars);
            String s1 = new String(chars);
            User user1 = JSONObject.parseObject(s1, User.class);
            System.out.println(user1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
       /*
       写入多个对象
       User user1 = new User("张三", 223, "哈哈123是");
        User user2 = new User("张2", 232, "哈哈12是");
        User user3 = new User("张1", 1213, "哈1231哈是");
        User user4 = new User("张三5", 123, "哈哈555是");
        List<User> users = Arrays.asList(user1, user2, user3, user4);
        String s1 = JSONObject.toJSONString(users);

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        try (FileReader fileReader = new FileReader(file)) {
            char[] chars=new char[(int)file.length()];
            try {
                fileReader.read(chars);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String s = new String(chars);
            //对集合的json数据进行处理
            List<User> users = JSONObject.parseArray(s, User.class);
            System.out.println("》》》》》》》》》》》》》》"+users);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class  User{
    private  String name;
    private  int age;
    private  String address;

    public User() {
    }

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}