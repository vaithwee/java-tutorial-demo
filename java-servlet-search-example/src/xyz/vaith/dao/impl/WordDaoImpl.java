package xyz.vaith.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import xyz.vaith.bean.Word;
import xyz.vaith.dao.WordDao;
import xyz.vaith.util.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class WordDaoImpl implements WordDao {
    @Override
    public List<Word> queryWordByAssWord(String assWord) throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "SELECT * FROM words WHERE word LIKE ?";
        List<Word> list = runner.query(sql, new BeanListHandler<Word>(Word.class), assWord + "%");
        return list;
    }
}
