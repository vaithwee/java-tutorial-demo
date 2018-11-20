package xyz.vaith.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUitl {

    static ComboPooledDataSource dataSource;

    static {
        dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost/student");
            dataSource.setPassword("abcd1234");
            dataSource.setUser("root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static void close(Closeable obc) {
        try {
            if (obc != null) {
                obc.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
