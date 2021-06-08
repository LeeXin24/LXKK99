import java.util.Scanner;

public class ZY02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入天数：");
        int day = scanner.nextInt();

        int daySum=0;

        switch (month){
            case 12:
                daySum += 30;
            case 11:
                daySum += 31;
            case 10:
                daySum += 30;
            case 9:
                daySum += 31;
            case 8:
                daySum += 31;
            case 7:
                daySum += 30;
            case 6:
                daySum += 31;
            case 5:
                daySum += 30;
            case 4:
                daySum += 31;
            case 3:
                daySum += 28;
            case 2:
                daySum += 31;
            case 1:
                daySum += day;
        }
        System.out.println("今年已经过去了"+daySum+"天");
    }
}
