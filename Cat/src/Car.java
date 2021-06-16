public class Car {
    private String brand;
    private String model;
    private double chang;
    private double gao;
    private String color;

    public void action() {
        System.out.println(this.brand+"制冷");
    }
    public void action2() {
        System.out.println(this.brand+"播放音频");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getChang() {
        return chang;
    }

    public void setChang(double chang) {
        this.chang = chang;
    }

    public double getGao() {
        return gao;
    }

    public void setGao(double gao) {
        this.gao = gao;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", chang=" + chang +
                ", gao=" + gao +
                ", color='" + color + '\'' +
                '}';
    }


}
