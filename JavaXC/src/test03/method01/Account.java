package test03.method01;
// 这个程序采用的是synchronized方式的锁住线程
/**
 * 账号信息：
 *
 * **/
class Account{
    // 余额
    private double balance;
    // 构造函数
    public  Account(double balance)
    {
        super();
        this.balance = balance;

//super(name);
    }
    // getter函数
    public double getBalance()
    {
        return balance;
    }
    // setter函数
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}