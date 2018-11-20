package xyz.vaith.dao;

import xyz.vaith.bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    List<Student> getAll() throws SQLException;
}
