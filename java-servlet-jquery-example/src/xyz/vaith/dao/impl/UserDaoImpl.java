package xyz.vaith.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import xyz.vaith.dao.UserDao;
import xyz.vaith.util.JdbcUtil;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean isExistUser(String username) throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";
        Long result = runner.query(sql, new ScalarHandler<>(), username);
        return result > 0;
    }
}
