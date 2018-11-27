package xyz.vaith.service.impl;

import xyz.vaith.dao.UserDao;
import xyz.vaith.dao.impl.UserDaoImpl;
import xyz.vaith.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    @Override
    public boolean isExistUser(String username) {
        UserDao dao = new UserDaoImpl();
        boolean isExist = false;
        try {
            isExist = dao.isExistUser(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isExist;
    }
}
