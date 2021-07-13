package test02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(9999);
        //监听客户端连接，返回一个对应的Socket对象
        Socket s = ss.accept();
        //接受数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("Socket\\A.txt"));

        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();
    }
}
