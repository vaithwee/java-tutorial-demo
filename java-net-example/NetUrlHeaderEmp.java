import java.io.IOException;
import java.net.*;
import java.util.*;

public class NetUrlHeaderEmp {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.runoob.com");
        URLConnection conn = url.openConnection();
        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for (String key : keys) {
            String val = conn.getHeaderField(key);
            System.out.println(key + ": " + val);
        }
        System.out.println(conn.getLastModified());
    }
}