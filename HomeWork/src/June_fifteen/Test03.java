package June_fifteen;

import java.util.Arrays;

public class Test03 {


    public static void main(String[] args) {
        //定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出

        int [] arr={213,12,5,22,22254,12,8,4512,122,512};
        System.out.println(Arrays.toString(getMaxAndIndex(arr)));
    }

    public static  int [] getMaxAndIndex(int [] arr){
        int  max=-1;
        int  index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        int [] newArray={max,index};
        return  newArray;
    }

}
