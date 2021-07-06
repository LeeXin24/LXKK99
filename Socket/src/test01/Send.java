package test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Send {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket  datagramSocket= null;
        try {
            datagramSocket = new DatagramSocket( );
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (true){
            try {
                String  str=scanner.next();
                DatagramPacket datagramPacket=new DatagramPacket(str.getBytes(StandardCharsets.UTF_8),
                        str.getBytes(StandardCharsets.UTF_8).length,InetAddress.getByName( "192.168.1.103" ),8686);
                datagramSocket.send(datagramPacket);

                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket2=new DatagramPacket(bytes,bytes.length);
                datagramSocket.receive(datagramPacket2);
                byte[] data = datagramPacket2.getData();
                int length = datagramPacket2.getLength();

                String s = new String(data, 0, length, StandardCharsets.UTF_8);
                System.out.println("从服务端发送的数据为:"+s);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
