package xyz.vaith.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import xyz.vaith.bean.Student;
import xyz.vaith.dao.StudentDao;
import xyz.vaith.util.JdbcUitl;

import java.sql.SQLException;
import java.util.List;

public class StudentDapImpl implements StudentDao {
    @Override
    public List<Student> getAll() throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUitl.getDataSource());
        return runner.query("select * from student", new BeanListHandler<Student>(Student.class));
    }
}
