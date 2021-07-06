package test03.method03;

public class lockThread {
    public static void main(String[] args) {
        Account2 a = new Account2(1000);
        ATM2 atm = new ATM2(a, 200);

        new Thread(atm, "张三").start();
        new Thread(atm, "张三他爸").start();
    }
}