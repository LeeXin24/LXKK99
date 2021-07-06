package test03;
//      开启两个线程,得到如下结果    1A   2B   3C   4D  ....
public class TestThread {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        CharThread charThread = new CharThread();
        numberThread.setPriority(10);
        charThread.setPriority(1);
        numberThread.start();
        charThread.start();
    }
}
