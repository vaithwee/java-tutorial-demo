import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NetMultisocEmp {
    public static void main(String[] args) throws Exception {
        ServerSocket ssock = new ServerSocket(1234);
        System.out.println("listening");
        while (true) {
            Socket sock = ssock.accept();
            System.out.println("connected");
            new Thread(new MultiThreadServer(sock)).start();
        }
    }
}

class MultiThreadServer implements Runnable {
    Socket csocket;
    MultiThreadServer(Socket socket) {
        this.csocket = socket;
    }

    public void run() {
        try {
            PrintStream pStream = new PrintStream(csocket.getOutputStream());
            for (int i = 100; i >= 0; i--) {
                pStream.println(i + " bottles of beer on the wall");
            }
            pStream.close();
            csocket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}