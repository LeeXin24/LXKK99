class MyThread extends Thread{
    static int ticket = 100;

    public void run(){
        for (int i = ticket; i > 0; i--) {
            System.out.println(Thread.currentThread().getName()+"正在卖第"+(ticket--)+"张票");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }

        }
    }

}
class test {
    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        myThreadA.setName("窗口A");
        MyThread myThreadB = new MyThread();
        myThreadB.setName("窗口B");
        MyThread myThreadC = new MyThread();
        myThreadC.setName("窗口C");

        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
    }
}