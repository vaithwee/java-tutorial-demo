package xyz.vaith;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
    private JDBCUtil() {}

    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    static {
        Properties config = new Properties();
        try {
            InputStream inputStream = new FileInputStream("config/sqlconfig.properties");
            config.load(inputStream);
            driver = config.getProperty("driver");
            url = config.getProperty("url");
            user = config.getProperty("user");
            password = config.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        Connection conn = null;
        try {
//            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static  void release(AutoCloseable conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }
}
