package practice;

import practice.pojo.Business;
import practice.service.BusinessService;
import practice.service.impl.BusinessServiceImpl;
import practice.util.DataUtil;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println("---------------欢迎进入中国商城管理系统--------------");
        /**
         * 商家
         * 产品
         */
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入要操作的数字:");
            System.out.println("1.登录 \t 2.注册 \t 3.退出");
            int i = scanner.nextInt();
            BusinessService businessService = new BusinessServiceImpl();

            switch (i){
                case 1:
                    while (true) {
                        System.out.println("请输入姓名:");
                        String name = scanner.next();
                        System.out.println("请输入密码:");
                        String password = scanner.next();

                        boolean login = businessService.login(name, password);
                        // 如果在登录的时候  用户名存在 但是密码不正确  这个时候要重新输入

                        //但是如果用户名都不存在  那么就只能告诉商家要重新注册   重新注册之后   要重新返回去登录（没有产品）

                        if(login){
                            //如果登录成功就进入系统 并且一进去就能看到所有的产品
                            DataUtil.print();
                            break;
                        }else{
                            //
                            System.out.println("您输入的账户或者密码不正确 请重新输入....");
                        }
                    }

                    break;
                case 2:

                    /**
                     * 在注册的时候要判断一下 原本的数组中是否已经存在注册过的名字了
                     */

                    /**
                     *      private String name;
                     *     private String nick; //别称
                     *     private String phone;//联系方式
                     *     private String password;
                     *     private String  IDCard;
                     */
                    System.out.println("请输入用户名:");
                    String name=scanner.next();

                    System.out.println("请输入昵称:");
                    String nick=scanner.next();

                    System.out.println("请输入phone:");
                    String phone=scanner.next();

                    System.out.println("请输入password:");
                    String password=scanner.next();

                    System.out.println("请输入IDCard:");
                    String IDCard=scanner.next();

                    businessService.register( new Business(name,nick,phone,password,IDCard));
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }
    }
}
