import java.io.*;
//1.字节流
public class User {
    public static void main(String[] args)throws IOException {
        File file = new File("upload/User.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        OutputStream user = null;
        try{
            user = new FileOutputStream(file,true);
            String str1 = "张三，25，123456，10";
            String str2 = "\n李四，26，234567，11";
            String str3 = "\n王五，27，345678，12";
            /*user.write(str1.getBytes());
            user.write(str2.getBytes());
            user.write(str3.getBytes());*/
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                assert user != null;
                user.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try(InputStream inputStream = new FileInputStream(file)){
            byte[] bytes = new byte[(int)file.length()];

            int line = inputStream.read();
            int key = 0;
            while (line != -1){
                bytes[key++] = (byte) line;
                line = inputStream.read();
            }
            inputStream.read(bytes);

            String s = new String(bytes);
            System.out.println(s);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
