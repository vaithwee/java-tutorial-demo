package xyz.vaith.sql.test;

import xyz.vaith.sql.dao.UserDaoImpl;

public class UserDaoTest {
    @Test
    public void testFindAll() {
        UserDaoImpl dao = new UserDaoImpl();
        dao.findAll();
    }
}
