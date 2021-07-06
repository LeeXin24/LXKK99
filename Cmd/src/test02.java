//      ## 尝试开启两个线程,得到如下结果    1A   2B   3C   4D  ....
//      一个线程的方法
class Mythread extends Thread {
    int number = 0;
    char ch = 'A';
    boolean flag = false;

    @Override
    public void run() {
        while (ch <= 'Z') {
            if (!flag) {
                System.out.print(++number);
                flag = true;
            } else {
                System.out.print(ch + "\t");
                flag = false;
                ch++;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class test02{
    public static void main(String[] args) {
        Mythread test02 = new Mythread();
        test02.start();

    }
}