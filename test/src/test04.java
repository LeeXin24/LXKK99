import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n1:");
        int n1 = scanner.nextInt();
        System.out.println("请输入n2:");
        int n2 = scanner.nextInt();

        int result = multiply(n1,n2);
        System.out.println("");
    }

    private static int multiply(int n1, int n2) {
        int resulult = n1*n2;

        System.out.println(resulult);
        return resulult;
    }
}
