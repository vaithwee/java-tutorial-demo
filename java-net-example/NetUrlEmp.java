import java.net.*;

public class NetUrlEmp {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.runoob.com/html/html-tutorial.html");
        System.out.println("url: " + url.toString());
        System.out.println("protocol: " + url.getProtocol());
        System.out.println("filenmae: " + url.getFile());
        System.out.println("host: " + url.getHost());
        System.out.println("path: " + url.getPath());
        System.out.println("port: " + url.getPort());
        System.out.println("default port: " + url.getDefaultPort());
    }
}