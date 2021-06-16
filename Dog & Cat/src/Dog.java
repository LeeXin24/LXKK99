public class Dog {

    private String name = "";
    private int IQ;

    public void getInfo() {
        if (IQ < 20) {
            System.out.println("傻" + name);
        }
        if (IQ >= 20 && IQ <= 80) {
            System.out.println("普通的" + name);
        }
        if (IQ > 80) {
            System.out.println("聪明的" + name);
        }
    }
    public void playWith(Cat cat){
        System.out.println(new Dog()+"和"+new Cat()+"一起玩");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", IQ=" + IQ +
                '}';
    }
}