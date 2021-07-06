package test03.method02;

public class synchronizedThread {
    public static void main(String [] args)
    {
        Account1 a = new Account1(1000);
        ATM1 atm = new ATM1(200,a);
// 对于相同的账户，不同的人去取钱
        new Thread(atm, "张三").start();
        new Thread(atm, "张三他爸").start();
    }
}