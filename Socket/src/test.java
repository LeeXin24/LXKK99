import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {

    public static void main(String[] args) {

        try {
            InetAddress localhosts = InetAddress.getByName("www.baidu.com");
            System.out.println(localhosts.getHostAddress());
            // System.out.println( localhosts);

            InetAddress[] allByName = InetAddress.getAllByName("www.baidu.com");
            for (InetAddress inetAddress : allByName) {
                System.out.println(inetAddress.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
