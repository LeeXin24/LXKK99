package test03;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //
        Socket s = new Socket("192.168.1.119", 9898);
        //
        BufferedReader br = new BufferedReader(new FileReader("Socket\\Product.json"));
        //
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        //
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈:" + data);
        //
        br.close();
        s.close();
    }
}
