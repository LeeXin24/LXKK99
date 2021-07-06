package test03.method04;

public class BankThread implements Runnable {
    public double money;
    public Tool a;

    public BankThread(double money, Tool a) {
        super();
        this.money = money;
        this.a = a;
    }

    Object o = new Object();

    @Override
    public void run() {
        if (Tool.balance >= money) {
            System.out.println(Thread.currentThread().getName() + "从柜台取出的钱是:" + money + "元");

            a.setBalance(a.getBalance() - money);

            System.out.println("账户里还剩" + a.getBalance() + "元");
        } else {
            System.out.println("账户余额不足,还剩下" + a.getBalance() + "元");
        }
    }
}
