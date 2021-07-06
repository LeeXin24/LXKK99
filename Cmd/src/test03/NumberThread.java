package test03;

public class NumberThread extends Thread{
    int number = 1;

    @Override
    public void run() {
        while (Tool.ch <= 'Z') {
            System.out.print(number);
            number++;
            try {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
