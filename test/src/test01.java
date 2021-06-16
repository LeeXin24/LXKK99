import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        int[] arr = {10,1,61,89,36,35,55,61,35,88,89,1};
        //去除上述数组中的重复数据，并且对去除之后的数组进行排序

        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int index = 1;
        int last = arr[0];
        for (int i = 1;i< arr.length;i++){
            if (arr[i] != last){
                arr[index] = arr[i];
                last = arr[index];
                index++;
            }
        }
        int[] num = new int[index];
        System.arraycopy(arr,0,num,0,index);
        System.out.println(Arrays.toString(num));

        /*for (int i = 0;i < num.length/2;i++){
            if (num[i] > num[num[i]]) {
                int temp = num[i];
                num[i] = num[num[i]];
                num[num[i]] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
