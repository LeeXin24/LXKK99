package test03.method01;
/**
 *
 * 取钱的操作方法
 *
 */
class ATM implements Runnable {
    private double dMoney;
    private Account a;

    public ATM(double dMoney, Account a) {
        super();
        this.dMoney = dMoney;
        this.a = a;
    }

    Object o = new Object();

    public void run() {
// 采用同步的方式去，控制线程，一旦进入后就不能让其他的线程进入
        synchronized (a) {
// 如果余款大于取钱的数就操作
            if (a.getBalance() >= dMoney) {
// 输出要取得钱数
                System.out.println(Thread.currentThread().getName() +
                        "取出的钱是" + dMoney + "元");
// 设置余款
                a.setBalance(a.getBalance() - dMoney);
// 打印出余款
                System.out.println(Thread.currentThread().getName() +
                        "还剩" + a.getBalance() + "元");
            } else {
                System.out.println(Thread.currentThread().getName() +
                        "余额不足,还剩下" + a.getBalance() + "元");
            }
        }
    }
}