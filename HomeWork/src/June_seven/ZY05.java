package June_seven;

import java.util.Scanner;

public class ZY05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int first = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int second = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int third = scanner.nextInt();

        int max = first;
        if (max < second){
            max = second;
        }
        if (max <third){
            max = third;
        }
        System.out.println("最大值为："+max);
    }
}
