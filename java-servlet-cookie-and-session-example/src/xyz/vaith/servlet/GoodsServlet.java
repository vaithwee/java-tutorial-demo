package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GoodsServlet", urlPatterns = "/goods")
public class GoodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Cookie cookie = CookieUtil.findCookie(request.getCookies(), "history");
        if (cookie == null) {
            cookie = new Cookie("history", id);
        } else  {
            cookie.setValue(id + "#" + cookie.getValue());
        }
        response.addCookie(cookie);
        request.getRequestDispatcher("goodsdetail.html").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
