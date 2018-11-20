package xyz.vaith.service.impl;

import xyz.vaith.bean.Student;
import xyz.vaith.dao.StudentDao;
import xyz.vaith.dao.impl.StudentDapImpl;
import xyz.vaith.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getAll() {
        StudentDao dao = new StudentDapImpl();
        try {
            return dao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
