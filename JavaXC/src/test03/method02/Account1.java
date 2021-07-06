package test03.method02;

class Account1 {
    private double balance ;
    public Account1(double balance )
    {
        super();
        this.balance = balance ;
    }
    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

//  同步方法
//  取钱
    /**
     * 同步方法的同步监听器对象:   若该方法是非静态的那么就是this
     * 若方法是静态那么就是同步方法所在类的  Class clz  =  Account2.class;(一份字节码)
     */
    public synchronized void draw(double drawMoney )
    {
// 能取钱的操作函数
        if(balance >= drawMoney)
        {
// 取出多少钱
            System.out.println(Thread.currentThread().getName()+
                    "取出多少钱"+drawMoney);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
// 设置账户余额还有多少
            setBalance(balance - drawMoney);
//           余额还有多少  
            System.out.println(Thread.currentThread().getName()+
                    "账户的余额是："+getBalance());
        }
        else{
            System.out.println(Thread.currentThread().getName()+
                    "账户余额不足，余额为："+getBalance());
        }
    }
}