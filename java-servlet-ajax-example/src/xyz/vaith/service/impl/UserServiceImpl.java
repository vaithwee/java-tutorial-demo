package xyz.vaith.service.impl;

import xyz.vaith.dao.Impl.UserDaoImpl;
import xyz.vaith.dao.UserDao;
import xyz.vaith.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public boolean isExistUser(String username) {
        System.out.println("enter service");
        UserDao dao = new UserDaoImpl();
        try {
            return dao.isExistUser(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
