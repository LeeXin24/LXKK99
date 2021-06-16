public abstract class Test {
    public static void main(String[] args) {
        String index = "1234567890";
        String A = "1";
        String B = "2";
        String C = "B";
        String D = "d";

        System.out.println(index.charAt(3));//返回 char指定索引处的值。

        System.out.println(index.codePointAt(2));//返回指定索引处的字符（Unicode代码点）。

        System.out.println(index.codePointBefore(1));//返回指定索引之前的字符（Unicode代码点）。

        System.out.println(index.codePointCount(0,3));//返回此 String指定文本范围内的Unicode代码点数。

        System.out.println(A.compareTo(B));//按字典顺序比较两个字符串。

        System.out.println(C.compareToIgnoreCase(D));//按字典顺序比较两个字符串，忽略病例差异。

        System.out.println(index.concat(A));//将指定的字符串连接到该字符串的末尾。



    }
}
