package xyz.vaith.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    static ComboPooledDataSource dataSource = null;
    static  {
        dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost/ajaxuser");
            dataSource.setUser("root");
            dataSource.setPassword("abcd1234");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
