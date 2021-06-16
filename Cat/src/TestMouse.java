public class TestMouse {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("张三");
        cat.setSex('雄');

        Cat cat2 = new Cat();
        cat2.setAge(6);
        cat2.setName("李四");
        cat2.setSex('雄');


        cat.catchMouse();
        cat2.catchMouse();
    }
}