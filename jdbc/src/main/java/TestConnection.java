public class TestConnection {

    public static void main(String[] args) throws SQLException {
        String  url="jdbc:mysql://192.168.1.127:3306/bbs";  //jdbc:mysql://localhost:3306/student
        String  username="root";
        String  password="zhou";

        //缺少驱动
        DriverManager.registerDriver(new Driver());
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection.isClosed()+"\n"+connection);

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        /*List<Student> all = new StudentDao().getAll();
        for (Student student : all) {
            System.out.println(student);
        }*/

        //StudentDao studentDao = new StudentDao();

        /*StudentDao studentDao = new StudentDao();
        Student student = new Student("zhangsan",12,"fame",34.5,new Date());
        studentDao.addStudent(student);*/

        // studentDao.updateByName("wangwu",999.0);

        /*List<Student> s = studentDao.getByLike("s");
        for (Student student : s) {
            System.out.println(student);
        }*/

    }
}