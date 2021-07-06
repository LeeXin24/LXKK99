package test04;

public class AThread extends Thread{
    @Override
    public void run() {
        while (Tool.num <= 52){
            System.out.print(Tool.num++);
            System.out.print(Tool.num++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
