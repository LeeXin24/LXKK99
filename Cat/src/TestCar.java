public class TestCar {
    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("BC");
        car.setModel("1988");
        car.setChang(4);
        car.setGao(2);
        car.setColor("red");

        Car car2 = new Car();
        car2.setBrand("FLL");
        car2.setModel("1986");
        car2.setChang(3.5);
        car2.setGao(2);
        car2.setColor("blue");

        System.out.println(car.toString());
        System.out.println(car2.toString());

        car.action();
        car2.action2();
    }
}
