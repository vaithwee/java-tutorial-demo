package xyz.vaith.dao;

import java.sql.SQLException;

public interface UserDao {
    boolean isExistUser(String username) throws SQLException;
}
