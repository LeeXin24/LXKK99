package test03.method04;

public class ATMThread implements Runnable {
    public double money;
    public Tool a;

    public ATMThread(double money, Tool a) {
        super();
        this.money = money;
        this.a = a;
    }

    Object o = new Object();

    @Override
    public void run() {
        if (Tool.balance >= money) {
            System.out.println(Thread.currentThread().getName() + "从ATM机里取出的钱是:" + money + "元");

            a.setBalance(a.getBalance() - money);

            System.out.println("还剩" + a.getBalance() + "元");
        } else {
            System.out.println("余额不足,还剩下" + a.getBalance() + "元");
        }
    }
}
