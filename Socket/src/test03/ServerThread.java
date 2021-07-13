package test03;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            //
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //BufferedWriter bw = new BufferedWriter(new FileWriter("Socket\\Product.json"));
            //
            int count = 0;
            File file = new File("Socket\\Product[" + count + "].json");
            while (file.exists()){
                count++;
                file = new File("Socket\\Product[" + count + "].json");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
