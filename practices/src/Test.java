public class Test {

        public static void main(String[] args) {

            User user = new User();
            user.setName("张三");
            user.setAddress("不知道");
            user.setIdCard("9527");
            user.setPhone("12345678901");
            user.setPassword("789456");
            user.setSex('男');


            MethodFunction methodFunction = new MethodFunction();
            methodFunction.addUser(user);
            // methodFunction.print();


            user = new User();
            user.setName("张三2");
            user.setAddress("不知道2");
            user.setIdCard("95227");
            user.setPhone("123456278901");
            user.setPassword("7892456");
            user.setSex('男');

            methodFunction.addUser(user);
            methodFunction.print();

            String str="张三";
            System.out.println(str.equals("1"));

            //  System.out.println(user.getName().equals(str));

        }
}