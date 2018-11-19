package xyz.vaith;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost/bank");
            dataSource.setUser("root");
            dataSource.setPassword("abcd1234");

            conn = dataSource.getConnection();
            String sql = "select * from account";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String account = rs.getString("account");
                double money = rs.getDouble("money");
                System.out.println("id: " + id + ", account:" + account + ", money: " + money);
            }
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}
