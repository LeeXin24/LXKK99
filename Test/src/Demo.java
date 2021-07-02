import com.alibaba.fastjson.JSONObject;
import pojo.User;
import util.DataUtil;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String str = "{\"username\":\"张三\",\"password\":\"123\",\"Userid\":\"1\",\"datetime\":\"2021-07-01 10:10:10\"}";
        User  user = JSONObject.parseObject(str,User.class);
        //System.out.println(user);
        File file = new File("D:\\work\\LXKK99\\Test\\src\\user.json");
        try (FileReader fileReader = new FileReader(file)) {
            char[] chars=new char[(int)file.length()];
            try {
                fileReader.read(chars);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String s = new String(chars);
            List<User> users = JSONObject.parseArray(s, User.class);
            System.out.println(users);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------------欢迎进入贴吧---------------");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入要操作的数字:");
            System.out.println("1.登录 \t 2.注册 \t 3.退出");
            int i = scanner.nextInt();
            User UserService = new User();

            switch (i){
                case 1:
                    while (true) {
                        System.out.println("请输入姓名:");
                        String username = scanner.next();
                        System.out.println("请输入密码:");
                        String password = scanner.next();

                        boolean login = UserService.login(username, password);

                        if(login){
                            DataUtil.print();
                            break;
                        }else{
                            System.out.println("您输入的账户或者密码不正确 请重新输入!");
                        }
                    }
                    break;
                case 2:

                    System.out.println("请输入用户名:");
                    String username=scanner.next();

                    System.out.println("请输入password:");
                    String password=scanner.next();

                    System.out.println("请输入用户ID:");
                    String Userid=scanner.next();

                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }
    }
}
