package test04;
//      ### 4.创建两个线程，其中一个输出1-52，另外一个输出A-Z。输出格式要求：12A 34B 56C 78D
public class TestThread {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        BThread bThread = new BThread();
        aThread.setPriority(10);
        bThread.setPriority(1);
        aThread.start();
        bThread.start();
    }
}
