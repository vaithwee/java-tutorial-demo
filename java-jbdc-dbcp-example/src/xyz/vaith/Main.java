package xyz.vaith;


import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost/bank");
            dataSource.setUsername("root");
            dataSource.setPassword("abcd1234");

            conn = dataSource.getConnection();
            String sql = "SELECT * FROM account";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id") + ", account: " + rs.getString("account") + " , money: " + rs.getDouble("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }


    }
}
