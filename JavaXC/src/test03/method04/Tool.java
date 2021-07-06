package test03.method04;

public class Tool {
    public static double balance;

    public Tool(double balance) {
        super();
        Tool.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        Tool.balance = balance;
    }
}
