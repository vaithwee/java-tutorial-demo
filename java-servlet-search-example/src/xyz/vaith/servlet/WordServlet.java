package xyz.vaith.servlet;

import xyz.vaith.bean.Word;
import xyz.vaith.service.WordSerivce;
import xyz.vaith.service.impl.WordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "WordServlet", urlPatterns = "/words")
public class WordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        WordSerivce service = new WordServiceImpl();
        List<Word> list = service.queryWordByAssWord(keyword);
        for (Word word : list) {
            System.out.println(word);
        }
        if (list.size() == 0) {
            response.getWriter().write("");
        } else  {
            request.setAttribute("list", list);
            request.getRequestDispatcher("word.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
