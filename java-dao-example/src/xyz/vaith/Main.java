package xyz.vaith;

import xyz.vaith.sql.dao.UserDaoImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UserDaoImpl dao = new UserDaoImpl();
        dao.findAll();
    }
}
