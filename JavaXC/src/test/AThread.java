package test;

public class AThread extends Thread {
    @Override
    public void run() {
        while (Tool.ch <= 'Z') {
            System.out.print(Tool.ch++ + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
