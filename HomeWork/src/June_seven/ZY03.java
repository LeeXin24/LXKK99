package June_seven;

import java.util.Scanner;

public class ZY03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入number1");
        int number1 = scanner.nextInt();
        System.out.println("请输入number2");
        int number2 = scanner.nextInt();

        int max = number1;
        int min = number2;
        if (max<number2){
            max = number2;
        }
        if(min>number1){
            min = number1;
        }
        int count = 0;
        while (min<max){
            if (min%2==0){
                count++;
                System.out.println("偶数为："+min);
            }
            min++;
        }
        System.out.println("偶数的个数："+count);
    }
}
