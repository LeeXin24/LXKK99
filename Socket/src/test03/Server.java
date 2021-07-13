package test03;
/*#### 1.需求：基于TCP协议，客户端获取键盘录入的数据，将数据发给服务端，服务端将数据保存到服务端的硬盘上，
### 然后给客户端回送数据。(此功能完成之后  服务端和客户端都要加循环 再去试试)*/
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket ss = new ServerSocket(9898);

        while (true) {
            //
            Socket s = ss.accept();
            //
            new Thread(new ServerThread(s)).start();
        }
        //
        //ss.close();
    }
}
