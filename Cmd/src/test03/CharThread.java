package test03;

public class CharThread extends Thread{
    @Override
    public void run() {
        while (Tool.ch <= 'Z'){
            System.out.println(Tool.ch+++"\t");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
