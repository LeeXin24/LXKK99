package June_fifteen;

public class Test04 {
    public static void main(String[] args) {
        // 有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
        int[] ints = new int[30];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=(int)(Math.random()*10);
        }
        int[] arrayCount = getArrayCount(ints);
        for (int i = 0; i < arrayCount.length; i++) {
            System.out.println("下标为:"+i+",出现了"+arrayCount[i]+"次");
        }
    }
    public  static  int[] getArrayCount(int [] arr){
        int[] newArray = new int[10];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){   //下标等于数组里面的元素
                    newArray[i]++;
                }
            }
        }
        return   newArray;
    }

}
