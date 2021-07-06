public class test {
/*### 1.有三个线程  分别按顺序输出 A  B  C      D E F
### 2.两个加线程    两个减线程   分别执行++  --操作      加线程  要么全部执行   要么减线程全部执行
### 不能加线程一个 减线程一个 如   threadA ++  threadC --
###  应该是  threadA ++ threadB ++  或者 是 threadB++  threadA++  减线程也是一样
### 3.银行取钱问题  张三在柜台取钱，张三他爸在ATM机取钱   一共1000快 每次只能取200  一个人取一次
### 4.创建两个线程，其中一个输出1-52，另外一个输出A-Z。输出格式要求：12A 34B 56C 78D*/
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankThread bankThread = new BankThread(bank);
        new Thread(bankThread, "张三").start();
        new Thread(bankThread, "他爸").start();

        new  Thread(new Runnable() {
            @Override
            public void run() {
                int  number=0;
                while(number<52){
                    synchronized (test.class){
                        System.out.print(++number);
                        System.out.print(++number);
                        try {
                            test.class.notify();
                            test.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
        new  Thread(new Runnable() {
            @Override
            public void run() {
                char  ch='A';
                while(ch<='Z'){
                    synchronized (test.class){
                        System.out.print(ch++ + "\t");
                        try {
                            test.class.notify();
                            test.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

    }
}

class Bank {
    public static int money = 1000;
    public synchronized void del() {
        while(true){
            if(money==0){
                System.out.println(Thread.currentThread().getName()+"线程结束");
                this.notify();
                return;
            }
            System.out.println(Thread.currentThread().getName() + "取钱200,还剩下" + (money = money - 200));
            try {
                this.notify();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

}

class BankThread implements Runnable {
    private final Bank bank;

    public BankThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        bank.del();

    }
}