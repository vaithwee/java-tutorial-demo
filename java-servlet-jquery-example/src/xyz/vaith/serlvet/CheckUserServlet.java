package xyz.vaith.serlvet;

import xyz.vaith.service.UserService;
import xyz.vaith.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CheckUserServlet", urlPatterns = "/checkusr")
public class CheckUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        UserService service = new UserServiceImpl();
        boolean isExist = service.isExistUser(username);
        response.setContentType("text/html;charset=utf-8");
        if (isExist) {
            response.getWriter().print(1);
        } else  {
            response.getWriter().print(0);
        }
    }
}
