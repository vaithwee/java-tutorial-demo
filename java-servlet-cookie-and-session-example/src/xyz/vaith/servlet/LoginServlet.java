package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usr = request.getParameter("username");
        String pwd = request.getParameter("password");
        if ("admin".equals(usr) && "123".equals(pwd)) {
//            useDirectionToPage(response);
//            userSendDirectionMethod(response);
            useRequestDirectionMethod(request, response);
        } else  {
            response.getWriter().write("login fail");
        }
    }

    private void useRequestDirectionMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login_succeed.html").forward(request, response);
    }

    private void userSendDirectionMethod(HttpServletResponse response) throws IOException {
        response.sendRedirect("login_succeed.html");
    }

    private void useDirectionToPage(HttpServletResponse response) {
        response.setStatus(302);
        response.setHeader("Location", "login_succeed.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
