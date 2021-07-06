package test04;

public class BThread extends Thread{
    @Override
    public void run() {
        while (Tool.ch <= 'Z'){
            System.out.print(Tool.ch++ + "\t");
            try {
                Thread.sleep(500);
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
