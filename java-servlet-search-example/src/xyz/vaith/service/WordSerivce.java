package xyz.vaith.service;

import xyz.vaith.bean.Word;

import java.sql.SQLException;
import java.util.List;

public interface WordSerivce {
    List<Word> queryWordByAssWord(String assWord);
}
