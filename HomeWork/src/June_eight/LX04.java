package June_eight;

import java.util.Scanner;

public class LX04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //求和
        double  avg1=0;
        double  avg2=0;
        double  avg3=0;

        for (int i = 1; i <=3; i++) {
            int  sum=0;
            for (int j = 1; j <=4; j++) {
                System.out.println("请输入第"+i+"个班级的第"+j+"个人的成绩:");
                int  score=scanner.nextInt();
                sum+=score;  //分数和
            }
            //得到每个班级的平均分
            if(i==1){
                avg1=sum/4.0;
            }else if(i==2){
                avg2=sum/4.0;
            }else {
                avg3=sum/4.0;
            }
        }
        double  max=avg1;
        if(avg1<avg2){
            max=avg2;
        }
        if(max<avg3){
            max=avg3;
        }

        System.out.println("平均分最高的班级的分数为:"+max);


    }
}