import java.util.Scanner;

public class ZY04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        int   sum=0; //用来统计奇数和
        while(min<max){
            if(min%2==1){
                sum+=min;  //满足条件偶数自 + 一次   sum=sum+min;
                System.out.println("奇数为："+min);
            }
            min++;
        }
        System.out.println("奇数和为："+sum);
    }
}

