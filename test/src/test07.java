import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = scanner.nextInt();
        String str = "";
        int yuShu = 0;
        while (number > 0) {
            yuShu = number % 10;
            str += yuShu;
            number = number / 10;
        }
        System.out.println("输出结果为:" + str);
    }
}