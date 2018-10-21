import java.net.*;
import java.io.*;

public class NetPortEmp {
    public static void main(String[] args) {
        Socket stk;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("view " + i);
                stk = new Socket(host, i);
                System.out.println("port " + i + " has been used");
            } catch (UnknownHostException e) {
               System.out.println("Exception occured" + e);
               break;
            } catch (IOException e) {

            }
        }
    }
}