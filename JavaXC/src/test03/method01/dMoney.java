package test03.method01;
public class dMoney{
    public static void main(String[] args) {
// 账号钱的初始化
        Account aa = new Account(1000);
// 取钱的初始化
        ATM atm = new ATM(200, aa);
        new Thread(atm, "张三").start();
        new Thread(atm, "张三他爸").start();


    }
}
