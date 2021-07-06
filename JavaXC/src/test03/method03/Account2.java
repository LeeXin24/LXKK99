package test03.method03;
/**
 * java.util.concurrent.locks.Lock接口
 * java.util.concurrent.locks.ReentrantLock类
 * ReentrantLock,可重入锁,没有同步监听对象
 *
 *  格式:
 *
 *   private final ReentrantLock lock= new ReentrantLock();//创建锁的一个对象
 *
 *   public void  m(){
 *   //进入方法第一件事,上锁
 *   lock.lock();//获取锁
 *
 *   try{
 *   //需要同步的代码
 *   }finally{
 *   lock.unlock();//解锁,走人
 *   }
 *
 *   }
 *
 */
import java.util.concurrent.locks.ReentrantLock;
// 创建可重入锁
public class Account2
{
    private ReentrantLock lock = new ReentrantLock();
    private double balance ;
    public Account2(double balance)
    {
        super();
        this.balance = balance ;
    }

    public double getBalance ()
    {
        return balance;
    }
    public void setBalance (double balance)
    {
        this.balance = balance ;
    }
    public void draw2(double drawMoney)
    {
        lock.lock();
        try{
// 能取钱的操作函数
            if(balance >= drawMoney)
            {
// 取出多少钱
                System.out.println(Thread.currentThread().getName()+
                        "取出"+drawMoney+"块钱");
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
                        "账户的余额为："+getBalance()+"元");
            }
            else{
                System.out.println(Thread.currentThread().getName()+
                        "账户余额不足，余额为："+getBalance()+"元");
            }
        }finally{
            lock.unlock();
        }
    }
}