package xyz.vaith.service;

import xyz.vaith.bean.City;

import java.sql.SQLException;
import java.util.List;

public interface CityService {
    List<City> getAllCity(int pid) throws SQLException;
}
