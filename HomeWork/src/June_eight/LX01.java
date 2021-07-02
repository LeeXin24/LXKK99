package June_eight;

public class LX01 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + '\t');
            }
            System.out.println(" ");
        }
    }
}