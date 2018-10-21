import java.net.URL;
import java.net.URLConnection;

public class NetServerFileEmp {
    public static void main(String[] args) throws Exception {
        int size;
        URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0) {
            System.out.println("unkown file size");
        } else {
            System.out.println("file size: " + size + " bytes");
        }
        conn.getInputStream().close();
    }
}