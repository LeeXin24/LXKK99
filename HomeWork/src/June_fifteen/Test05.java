package June_fifteen;

import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
       /* 你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
        输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
        输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。*/
        Scanner scanner = new Scanner(System.in);
        int  countOu=0;
        int  countJi=0;
        while (true){
            System.out.println("请输入数据:");
            int  number=scanner.nextInt();
            if(number==-1){
                System.out.println("程序结束");
                break;
            }
            if(number>0 && number<100000){
                if(number%2==1){
                    countJi++;
                }else {
                    countOu++;
                }
            }else{
                System.out.println("您输入的数据不在范围内,请重新输入:");
            }
        }
        System.out.println("奇数出现的次数为:"+countJi+",偶数出现的次数:"+countOu);
    }
}
