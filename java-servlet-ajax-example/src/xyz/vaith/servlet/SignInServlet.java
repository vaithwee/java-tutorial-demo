package xyz.vaith.servlet;

import xyz.vaith.service.UserService;
import xyz.vaith.service.impl.UserServiceImpl;
import xyz.vaith.util.JDBCUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SignInServlet", urlPatterns = "/signincheck")
public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        UserService service = new UserServiceImpl();
        boolean isExist = service.isExistUser(username);
        response.getWriter().print(isExist?1:0);
    }
}
