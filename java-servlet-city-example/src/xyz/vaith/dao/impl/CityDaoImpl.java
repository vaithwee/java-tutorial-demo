package xyz.vaith.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import xyz.vaith.bean.City;
import xyz.vaith.dao.CityDao;
import xyz.vaith.util.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public List<City> getAllCity(int pid)  {
        QueryRunner runner = new QueryRunner(JdbcUtil.getDatasource());
        String sql = "SELECT * FROM city WHERE pid = ?";
        try {
            return runner.query(sql, new BeanListHandler<City>(City.class), pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
