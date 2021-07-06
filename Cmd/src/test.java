import java.util.Scanner;
//      ## 开启一个线程，接收键盘的输入，将输入的值，逐个字符依次输出到屏幕上，输出每个字符的时间间隔是500ms
public class test extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            System.out.println(c + "\t");
            try {
                try {
                    Thread.sleep(500);
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class TestThread {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }*/



        new Mythread().start();
    }
}