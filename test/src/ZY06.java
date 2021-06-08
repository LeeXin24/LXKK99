import java.util.Scanner;

public class ZY06 {
    public static void main(String[] args) {
        //手动输入0~9之间的数，求出现的偶数的次数，如果输入的数小于0或者是大于9，程序结束（向控制台输出：您输入的数据过大）
        Scanner scanner =new Scanner(System.in);
        //定义一个统计偶数个数的变量；
        int count = 0;
        int key = 0;//用来统计总共输入了几次；
        while (true){
            System.out.println("请输入一个数：");
            int i = scanner.nextInt();
            key++;
            if (i >= 0 && i <= 9){
                if (i%2==0){
                    count++;
                }
            } else {
                System.out.println("程序结束：您输入的数据过大!");
                break;
            }
        }
        System.out.println("您一共输入了"+key+"次，其中偶数有"+count+"个");
    }
}
