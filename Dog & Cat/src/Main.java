public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("哈士奇");
        dog.setIQ(-100);

        Dog dog2 = new Dog();
        dog2.setName("柯基");
        dog2.setIQ(40);

        Dog dog3 = new Dog();
        dog3.setName("金毛");
        dog3.setIQ(100);

        Cat cat1 = new Cat();
        cat1.setName("波斯");
        cat1.setColor("白色");

        Cat cat2 = new Cat();
        cat2.setName("英短");
        cat2.setColor("黑色");

        System.out.println(dog.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

        dog.getInfo();
        dog2.getInfo();
        dog3.getInfo();

        cat1.getInfo();
        cat2.getInfo();

    }
}
