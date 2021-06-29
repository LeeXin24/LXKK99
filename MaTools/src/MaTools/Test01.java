package MaTools;

public class Test01 {
    static String index = "1234567890";
    static String A = "1";
    static String B = "2";
    static String C = "b";
    static String D = "d";

    public static void main(String[] args) {
        System.out.println(index.charAt(0));                  //1.返回 char指定索引处的值。

        System.out.println(index.codePointAt(1));       //2.返回指定索引处的字符（Unicode代码点）。

        System.out.println(index.codePointBefore(2));   //3.返回指定索引之前的字符（Unicode代码点）。

        System.out.println(index.codePointCount(0,2));        //4.返回此 String指定文本范围内的Unicode代码点数。

        System.out.println(A.compareTo(B));                   //5.按字典顺序比较两个字符串。

        System.out.println(C.compareToIgnoreCase(D));         //6.按字典顺序比较两个字符串，忽略病例差异。

        System.out.println(index.concat(A));                  //7.将指定的字符串连接到该字符串的末尾。

        System.out.println(index.contains(A));                //8.当且仅当此字符串包含指定的char值序列时才返回true。

        System.out.println(index.contentEquals(A));           //9.将此字符串与指定的CharSequence进行 CharSequence。

        System.out.println(index.contentEquals(B));           //10.将此字符串与指定的StringBuffer进行 StringBuffer 。

    }
}