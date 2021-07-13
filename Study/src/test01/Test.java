package test01;

//  ###求一个长度为10的整型数组的最大元素，采用随机的方式赋值并输出个元素的值

public class Test {
    public static void main(String[] args) {
        //声明一个长度为10的数组
        int arr[] = new int[10];
        //随机赋值数组
        setArrValuelnRand(arr);
        //输出数组所有元素
        printArry(arr);
        //返回数组最大值
        getArryMaxValue(arr);
        System.out.println();
        System.out.println("数组最大的元素为:" + getArryMaxValue(arr));
    }

    private static int getArryMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void printArry(int[] arr) {
        System.out.println("数组所有元素为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    private static void setArrValuelnRand(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }
}