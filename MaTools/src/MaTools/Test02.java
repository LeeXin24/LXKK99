package MaTools;

public class Test02 {
    static String A = "一二三四五六七八九十。";
    static String B = "壹贰叁肆伍陆柒捌玖拾。";
    static String C = "12345678910。";
    int D= 5;
    static char[] E = new char[5];

    public static void main(String[] args) {

        System.out.println(A.endsWith("。"));           //11.测试此字符串是否以指定的后缀结尾。

        System.out.println(A.equals("。"));             //12.将此字符串与指定对象进行比较。

        System.out.println(A.equalsIgnoreCase(B));      //13.将此 String与其他 String比较，忽略案例注意事项。

        /*{
            String str = "make a fortune";
            byte[] byt = str.getBytes();
            for (byte b : byt) {
                System.out.println(b);
            }
            *//*System.out.println(str.getBytes());*//*               //14.使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
         *//*System.out.println(str.getBytes())*//*;               //15.使用给定的charset将该String编码为字节序列，将结果存储到新的字节数组中。
         *//*System.out.println(str.getBytes());*//*               //16.使用命名的字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        }*/
        /*{
            C.getChars(1,3,E,5);
            System.out.print("输出为:" );
            System.out.println(E);                                 //17.将此字符串中的字符复制到目标字符数组中。
        }*/

        System.out.println(A.hashCode());                          //18.返回此字符串的哈希码。

        System.out.println(A.indexOf(0));                          //19.返回指定字符第一次出现的字符串内的索引。

        System.out.println(A.indexOf(1));                           //20.返回指定子字符串第一次出现的字符串内的索引。

    }
}