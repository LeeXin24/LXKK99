package June_seven;

import java.util.Scanner;

public class ZY01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入任意月份：");
        int number = scanner.nextInt();
        if (number > 0 && number<=3){
            System.out.println("这个月春季。");
        } else if (number>3 && number<=6) {
            System.out.println("这个月夏季。");
        } else if (number>6 && number<=9) {
            System.out.println("这个月秋季。");
        } else if (number>9 && number<=12) {
            System.out.println("这个月冬季。");
        } else if (number<0) {
            System.out.println("您输入的月份不对！");
        } else if (number>12) {
            System.out.println("您输入的月份不对！");
        }
    }
}
