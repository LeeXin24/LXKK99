package test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class Recevie {


    public static void main(String[] args) {


        try {
            DatagramSocket datagramSocket = new DatagramSocket(8686);
            while (true) {
                //int sendBufferSize = datagramSocket.getSendBufferSize();
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 1024);
                datagramSocket.receive(datagramPacket);

                byte[] data = datagramPacket.getData();
                int length = datagramPacket.getLength();  //获取发送数据的实际长度

                String s = new String(data, 0, length, StandardCharsets.UTF_8);
                System.out.println(datagramPacket.getAddress().getHostAddress() + "发送了:" + s);


                String str = "是我接收端,我已经接收到了,请继续发送....";
                DatagramPacket datagramPacket2 = new DatagramPacket(str.getBytes(StandardCharsets.UTF_8),
                        str.getBytes(StandardCharsets.UTF_8).length,
                        datagramPacket.getAddress(), datagramPacket.getPort());
                datagramSocket.send(datagramPacket2);
                //如何循环接受    发送端发送的数据
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
