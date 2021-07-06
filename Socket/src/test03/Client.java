package test03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("192.168.1.103", 8585);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("张三".getBytes(StandardCharsets.UTF_8));
            outputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


        /**
         * 需求：基于TCP协议，客户端获取键盘录入的数据，将数据发给服务端，服务端将数据保存到服务端的硬盘上，
         * 然后给客户端回送数据。(此功能完成之后  服务端和客户端都要加循环 再去试试)
         */
    }


}
