import java.io.*;
//3.缓冲流写入
public class User03 {
    public static void main(String[] args) {
        File file = new File("upload/User.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write("<--------------------->");
            writer.write("\n");
            writer.write("张三，25，123456，10");
            writer.write("\n");
            writer.write("李四，26，234567，11");
            writer.write("\n");
            writer.write("王五，27，345678，12");
            writer.write("\n");

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
        Reader  reader=null;
        try {
            reader   =new FileReader(file);
            char [] ch=new char[(int)file.length()];

            int read = reader.read();
            int key=0;
            while(read!=-1){
                ch[key++]=(char)read;
                read = reader.read();
            }
            String s = new String(ch,0, key);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}