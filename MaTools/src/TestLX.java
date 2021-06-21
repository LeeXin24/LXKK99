//3. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
/*        "To be or not to be"，将变成"oT eb ro ton ot eb."。

        ```
        tips:
        split(String)
        将调用的String对象拆分成String数组，根据传入的String内容进行切割，参考example/StringDemo
        ```
        ```*/
public class TestLX {
    public static void main(String[] args) {
        String s1 = "To be or not to be";
        String[] s2 = s1.split(" ");
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < s2.length; i++) {
            StringBuffer s3 = new StringBuffer(s2[i]);
            s3.reverse();
            str.append(s3);
            if (i == s2.length - 1) {
                str.append(".");
            } else {
                str.append(" ");
            }
        }
        System.out.println(str);
    }
}
