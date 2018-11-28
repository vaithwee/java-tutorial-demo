package xyz.vaith.dao;

import xyz.vaith.bean.Word;

import java.sql.SQLException;
import java.util.List;

public interface WordDao {
    List<Word> queryWordByAssWord(String assWord) throws SQLException;
}
