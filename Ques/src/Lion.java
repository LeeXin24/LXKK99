public class Lion {

    private String name;
    private char sex;
    private double heightInCM;
    private double width;
    private int age;

    public void eat() {
        System.out.println("在进食。");
    }
    public void sleep() {
        System.out.println("在睡觉。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getheightInCM() {
        return heightInCM;
    }

    public void setheightInCM(double height) {
        this.heightInCM = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", heightInCM=" + heightInCM +
                ", width=" + width +
                ", age=" + age +
                '}';
    }
}