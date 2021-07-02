package June_fifteen;

public class Test01 {

    public static void main(String[] args) {

        //2.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
        int number = 4567;
        int[] ints = new int[1];
        int yuShu = -1;
        while (true) {
            yuShu = number % 2;
            ints[ints.length - 1] = yuShu;
            number = number / 2;
            if (number > 0) {
                //对数组进行扩容
                ints = getArr(ints);  //多出的一个零是数组扩容了

            } else {
                break;
            }
        }
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + "\t");
        }

    }

    //对数组进行扩容
    public static int[] getArr(int[] arr) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

}
