import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//3.缓冲流
public class User02 {
    public static void main(String[] args) {
        File file = new File("User.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write("张三，25，123456，10");
            writer.write("\n");
            writer.write("李四，26，234567，11");
            writer.write("\n");
            writer.flush();
            writer.write("王五，27，345678，12");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}