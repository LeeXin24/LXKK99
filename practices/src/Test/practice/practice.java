package Test.practice;

public class practice {

    /*- name : String
- price : double
- scanCode : int
- num : int*/
    private String name;
    private double price;
    private  int scanCode;
    private static int num;
    // private int  newScanCode;


    // ScanCode 是一个4位数字，首位数字不能为0，将在构造对象的时候自动生成，保证每一个Product对象的ScanCode是唯一的
    //1~9   0~9  0~9  0~9

    public practice(String name, double price) {
        this.name = name;
        this.price = price;
        // newScanCode= scanCode++;
        int  qianwei=(int)(Math.random()*9+1)*1000;   //  1015      1000+0+10+5
        int  baiwei=(int)(Math.random()*10)*100;
        int  shiwei=(int)(Math.random()*10)*10;
        int  gewei=(int)(Math.random()*10);
        scanCode=qianwei+baiwei+shiwei+gewei;

    }

    /*public int getNewScanCode() {
        return newScanCode;
    }*/

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getScanCode() {
        return scanCode;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void changePrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", scanCode=" + scanCode +
                ", num=" + num +
                '}';
    }

    public boolean buy(int num) {
        if (this.num < num) {
            return false;
        }
        this.num = this.num - num;
        return true;
    }
    /*    方法
- 构造方法(String name,double price)
- String getName()
- int getScanCode()
- double getPrice()
- void changePrice(double)
- int getNum()
- void setNum(int)
- String getInfo()
- boolean buy(int)

    ScanCode 是一个4位数字，首位数字不能为0，将在构造对象的时候自动生成，保证每一个Product对象的ScanCode是唯一的
    buy 方法将num 减去传入的数字，如果传入数字较大表示库存不足，num不做修改则返回false，否则返回true

    getInfo() 返回一个字符串如下*/
}
class   Test{
    public static void main(String[] args) {
        practice fruit = new practice("水果", 123);
        practice vegetable = new practice("蔬菜", 127);

        System.out.println(fruit.getInfo());
        System.out.println(vegetable.getInfo());

    }

}
