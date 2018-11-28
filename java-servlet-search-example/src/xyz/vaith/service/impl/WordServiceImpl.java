package xyz.vaith.service.impl;

import xyz.vaith.bean.Word;
import xyz.vaith.dao.WordDao;
import xyz.vaith.dao.impl.WordDaoImpl;
import xyz.vaith.service.WordSerivce;

import java.sql.SQLException;
import java.util.List;

public class WordServiceImpl implements WordSerivce {
    @Override
    public List<Word> queryWordByAssWord(String assWord) {
        WordDao dao = new WordDaoImpl();
        try {
            return dao.queryWordByAssWord(assWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
