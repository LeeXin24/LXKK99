//编写一个main方法用来测试上述两个方法，定义一个数组，内容 {13,26,-3,4,54,26,37,18,69,-10}，
// 编写一个print方法，使用字符串拼接的方式，将数组内容数组输出为如下格式，每5个换行
public class test05 {
    public static void main(String[] args) {
        int [] arr = {13,26,-3,4,54,26,37,18,69,-10};

        System.out.println(print(arr));
    }

    public static  String print(int[] arr) {
        String str = "[";
        String str2 = "]";
        String in = "";

        for (int i = 0; i < arr.length; i++) {
            in = in + str + i + str2+"="+arr[i]+"\t";
            if((i+1)%5==0){
                in = in+"\n";
            }
        }
        return in;
    }
}
