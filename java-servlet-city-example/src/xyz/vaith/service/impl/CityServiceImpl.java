package xyz.vaith.service.impl;

import xyz.vaith.bean.City;
import xyz.vaith.dao.CityDao;
import xyz.vaith.dao.impl.CityDaoImpl;
import xyz.vaith.service.CityService;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImpl implements CityService {
    @Override
    public List<City> getAllCity(int pid) throws SQLException {
        CityDao dao = new CityDaoImpl();
        return dao.getAllCity(pid);
    }
}
