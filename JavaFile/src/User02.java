import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//2.字符流写入
public class User02 {

    public static void main(String[] args) {
        File src = new File("upload/User.txt");
        Writer w = null;
        String x = "张三，25，123456，10";
        String y = "李四，26，234567，11";
        String z = "王五，27，345678，12";
        try {
            w = new FileWriter(src);
            w.write(x);
            w.write("\n");
            w.write(y);
            w.write("\n");
            w.write(z);
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (w != null) {
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}