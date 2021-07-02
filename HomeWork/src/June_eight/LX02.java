package June_eight;

public class LX02 {
    public static void main(String[] args) {
        int num = 0;
        for (int x = 0; x < 4; x++) {
            for(int y = 0; y <= x; y++){
                System.out.print(num++);
            }
            System.out.println(" ");
        }
    }
}
