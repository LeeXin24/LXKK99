public class elephant {

    //封装:将相同类型的模板进行提取到一个类中，私有化属性公有化方法

    double height = 3.5;
    double weight = 2000;
    String name = "张三";
    char sex = '雄';
    private int age = 5;  //全局变量

    //提供一个共有的方法  对其进行赋值

    //提供一个公有化的访问方法
    public  void   newHeight(double newHeight){
        if(newHeight >1.5 && newHeight<= 4.5){
            height = newHeight;
        }else{
            System.out.println("身高有误...");
        }
    }
    public  void   newweight(int newweight){
        if(newweight >500 && newweight<= 3000){
            weight=newweight;
        }else{
            System.out.println("体重有误...");
        }
    }
    public  void   setAge(int newAge){
        if(newAge >0 && newAge<= 15){
            age=newAge;
        }else{
            System.out.println("年龄有误...");
        }
    }
    public   int  getAge(){
        return age;
    }

    /**
     * 体重  身高  姓名   年龄    性别
     * <p>
     * 表演   进食    繁衍行为  睡觉  ....
     */

    public void show() {
        System.out.println("大象在表演穿针引线");
    }

    public void eat() {
        System.out.println("大象在进食...");
    }

    public void Fy() {
        System.out.println("大象在繁衍...");
    }

}


class Person {

    /**
     * 属性  (定义的一些变量)
     * 行为（功能  方法  函数）
     */
    //car   颜色      车长度    车子马力  出厂日期   材质   品牌

    //车子的功能    driver     调节温度   玻璃清洁   播放音频  ....

    // 身高    体重   性别   年龄  血型   肤色   身份证(姓名  身份号   民族  出生年月  户口所在地 国籍  身份证颁发所属机关 头像  有效期)


}