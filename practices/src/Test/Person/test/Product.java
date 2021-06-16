package Test.Person.test;

public class Product {
    /*属性
    - name : String
    - price : double
    - scanCode : int
    - num : int*/
    private String name;
    private double price;
    private int scanCode;
    private int num;

/*方法
- 构造方法(String name,double price)
- String getName()
- int getScanCode()
- double getPrice()
- void changePrice(double)
- int getNum()
- void setNum(int)
- String getInfo()
- boolean buy(int)*/

    /*    --- 产品信息 ---
        名称: 手机
        编码：1001
        价格: 2001.00元*/
    public String getInfo(){
        System.out.println("--- 产品信息 ---");
        System.out.println("名称:"+this.name );
        System.out.println("编码："+this.scanCode);
        System.out.println("价格: "+this.price);
        return getInfo();
    }
    public boolean buy(){

        return false;
    }

    public String getName() {//- String getName()
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {//- double getPrice()
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScanCode() {//- int getScanCode()
        return scanCode;
    }

    public void setScanCode(int scanCode) {
        this.scanCode = scanCode;
    }

    public int getNum() {//- int getNum()
        return num;
    }

    public void setNum(int num) {//- void setNum(int)
        this.num = num;
    }
}
