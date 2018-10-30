package xyz.vaith;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	    //regisi driver

        Connection conn = null;
        Statement stat = null;
        ResultSet set = null;
        try {
            conn = JDBCUtil.getConn();
            stat = conn.createStatement();
            set = stat.executeQuery("select * from student");
            while (set.next()) {
                System.out.println("id:" + set.getInt("id") + ", name:" + set.getString("name") + ", age:" + set.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(set);
            JDBCUtil.release(stat);
            JDBCUtil.release(conn);
        }


    }

}
