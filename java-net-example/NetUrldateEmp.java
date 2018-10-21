import java.net.*;
import java.util.Date;

public class NetUrldateEmp {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.runoob.com");
        HttpURLConnection httpCon = (HttpURLConnection)url.openConnection();
        long date = httpCon.getDate();
        if (date == 0) {
            System.out.println("no date info");
        } else {
            System.out.println("Date: " + new Date(date));
        }
    }
}