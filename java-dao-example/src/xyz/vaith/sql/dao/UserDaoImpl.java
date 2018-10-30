package xyz.vaith.sql.dao;

import xyz.vaith.sql.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet set = null;
        try {
            conn = JDBCUtil.getConn();
            ps = conn.prepareStatement("select  * from student");
            set = ps.executeQuery();
            while (set.next()) {
                System.out.println("id: " + set.getInt("id") + ", name:" + set.getString("name") + ", age:" + set.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn);
            JDBCUtil.release(ps);
            JDBCUtil.release(set);
        }

    }
}
