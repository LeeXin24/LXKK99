package test03.method04;
//      ### 3.银行取钱问题  张三在柜台取钱，张三他爸在ATM机取钱   一共1000快 每次只能取200  一个人取一次
public class TestThread {
    public static void main(String[] args) {
        Tool money = new Tool(1000);//初始化账户存款
        BankThread bankThread = new BankThread(200, money);
        ATMThread atmThread = new ATMThread(200, money);
        new Thread(bankThread, "张三").start();
        new Thread(atmThread,"张三他爸").start();
    }
}
