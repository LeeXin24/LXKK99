package test01;
//      #### 1.需求：基于TCP协议，客户端获取键盘录入的数据，将数据发给服务端，服务端将数据保存到服务端的硬盘上，
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(1000);
        //监听客户端的连接，返回一个对应的Socket对象
        Socket s = ss.accept();

        //获取输入流
        /*InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        ss.close();
    }
}
