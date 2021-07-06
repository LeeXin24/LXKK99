package test03.method03;

class ATM2 implements Runnable{


    private double drawMoney;
    private Account2 a;
    public   ATM2(Account2 a, double drawMoney)
    {
        this.a = a;
        this.drawMoney = drawMoney;
    }
    public void run()
    {
        a.draw2(drawMoney);
    }
}


