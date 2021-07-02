package June_eleven;/*### 3.对指定的数组里面的数据做添加，删除操作 提供以下方法
        ```java
//在做此练习时，要考虑数组的的长度是否足够新添加的数据存放

*//**
 arr 目标数组
 number 要添加的数据
 index  指定的位置
 *//*
public  static  String [] add(String [] arr,String number,int index){

        return null;
        }

*/

import java.util.Arrays;

/**
 arr 目标数组
 number 要删除的数据的下标
 *//*

public static  String [] delete(String [] arr,int number){

        return null;
        }*/
public class Test03 {
    public static void main(String[] args) {

        String[] str = {"剑姬", "艾瑞利亚", "瑞文", "青钢影", "卡利斯塔", "德莱厄斯"};
        str = add(str, "ccc", 3);

        System.out.println(Arrays.toString(str));

        str=delete(str,5);

        System.out.println(Arrays.toString(str));


    }


    /**
     * @param arr    目标数组
     * @param number 要添加的数据
     * @param index  指定的位置
     */

    public static String[] add(String[] arr, String number, int index) {   //下表+1=长度

        if(arr==null || number==null){
            return null;
        }
        if(index-1< 0 || index > arr.length){
            return null;
        }

        String[] strings = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            strings[i]=arr[i];
        }
        System.out.println(Arrays.toString(strings));
        //插入指定的位置
        for (int i = strings.length-1; i >=index ; i--) {
            strings[i]=strings[i-1];
        }
        strings[index-1]=number;
        return strings;
    }

    /**
     * @param arr    目标数组
     * @param number 要删除的数据的下标
     */
    public static String[] delete(String[] arr, int number) {

        if(arr==null ){
            return null;
        }
        if(number-1< 0 || number > arr.length){
            return null;
        }
        arr[number-1]=null;

        String[] str = new String[arr.length - 1];  //减容
        int  index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                str[index++]=arr[i];
            }

        }
        return str;
    }
}
