package xyz.vaith.dao.Impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import xyz.vaith.bean.User;
import xyz.vaith.dao.UserDao;
import xyz.vaith.util.JDBCUtil;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean isExistUser(String username) throws SQLException {
        System.out.println("enter sql dao" + username);
        QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";
        Long result = runner.query(sql, new ScalarHandler<>(), username);
        return result > 0;
    }
}
