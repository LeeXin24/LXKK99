package test;

public class TestThread {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        BThread bThread = new BThread();
        CThread cThread = new CThread();
        aThread.setPriority(10);
        bThread.setPriority(5);
        cThread.setPriority(1);
        aThread.start();
        bThread.start();
        cThread.start();
    }
}
