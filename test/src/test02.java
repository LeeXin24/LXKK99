import java.util.Arrays;

public class test02 {
    public static void main(String[] args) {
        System.out.println(getConunt( 5));
    }
    public static int getConunt(int number) {
        int count = 0;
        //
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 30);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
            }
        }
        return count;
    }
}
