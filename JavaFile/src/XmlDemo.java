import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XmlDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("JavaFile/Student.xml");
        InputStream inputStream=new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        inputStream.read(bytes);
        inputStream.close();
        String s = new String(bytes);
        System.out.println(s);

    }
}