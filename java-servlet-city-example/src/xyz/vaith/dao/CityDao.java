package xyz.vaith.dao;

import xyz.vaith.bean.City;

import java.sql.SQLException;
import java.util.List;

public interface CityDao {
    List<City> getAllCity(int pid) throws SQLException;
}
