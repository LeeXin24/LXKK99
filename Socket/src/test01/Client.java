package test01;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.119", 1000);
        //客户端获取键盘录入的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null){
            if ("886".equals(line)) {
                break;
            }
            //获取输出流对象
            /*OutputStream os = s.getOutputStream();
            os.write(line.getBytes(StandardCharsets.UTF_8));*/
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
