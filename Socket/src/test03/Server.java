package test03;
/*#### 1.需求：基于TCP协议，客户端获取键盘录入的数据，将数据发给服务端，服务端将数据保存到服务端的硬盘上，
### 然后给客户端回送数据。(此功能完成之后  服务端和客户端都要加循环 再去试试)*/
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8585);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();

            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);

            /*int  index=0;
            while(read!=-1){
                bytes[index++]=(byte)read;
                read = inputStream.read(bytes);
            }*/
            String s = new String(bytes,0,read);
            System.out.println("从客户端发送的数据为:"+s);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
