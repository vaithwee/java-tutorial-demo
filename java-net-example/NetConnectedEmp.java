import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class NetConnectedEmp {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com", 80);
            addr = sock.getInetAddress();
            System.out.println("connected to " + addr);
            sock.close();
        } catch (IOException e) {
           System.out.println("couldn't connected " + args[0]);
           System.out.println(e);
        }
    }
}