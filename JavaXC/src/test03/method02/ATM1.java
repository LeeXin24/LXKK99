package test03.method02;

class  ATM1 implements Runnable{
    //      取得钱数  
    private double drawMoney;
    private Account1 a;
    public ATM1(double drawMoney, Account1 a)
    {
        this.drawMoney = drawMoney;
        this.a = a;
    }
    public void run()
    {
        a.draw(drawMoney);
    }
}