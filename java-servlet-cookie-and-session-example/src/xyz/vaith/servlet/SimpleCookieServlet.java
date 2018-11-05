package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SimpleCookieServlet", urlPatterns = "/simplecookie")
public class SimpleCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + ":" + cookie.getValue());
            }
        } else  {
            System.out.println("cookie is null");
        }

        setCookieToResponse(response);
        response.getWriter().write("simple cookie");
    }

    private void setCookieToResponse(HttpServletResponse response) {
        Cookie cookie = new Cookie("aa", "bb");
        cookie.setMaxAge(10);//set cookie expiry date, the values in second
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
