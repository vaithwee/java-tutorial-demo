package xyz.vaith.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtil {
    static ComboPooledDataSource dataSource = null;
    static  {
        dataSource = new ComboPooledDataSource();
    }

    public static DataSource getDatasource() {
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
