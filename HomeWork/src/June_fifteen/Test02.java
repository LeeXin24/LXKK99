package June_fifteen;

import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) {
        //6.30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数
        System.out.println(getCount(5));
    }
    public  static  int  getCount(int number){
        int  count=0;
        //生成10个随机数
        int []  arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=(int)(Math.random()*30);// 0~29
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]){
                ++count;
            }
        }
        return  count;
    }

}
