package MaTools;

public class Test03 {
    public static void main(String[] args) {
        /*    String str = "make a fortune";
            byte[] byt = str.getBytes();
            for (byte b : byt) {
                System.out.println(b);
            }
        }*/
        String Str1 = new String("www.runoob.com");
        char[] Str2 = new char[6];
        try {
            Str1.getChars(4, 10, Str2, 0);
            System.out.print("拷贝的字符串为：");
            System.out.println(Str2);
        } catch (Exception ex) {
            System.out.println("触发异常...");
        }
    }
}