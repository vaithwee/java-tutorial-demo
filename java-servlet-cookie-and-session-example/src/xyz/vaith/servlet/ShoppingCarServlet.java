package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ShoppingCarServlet", urlPatterns = "/addToShoppingCar")
public class ShoppingCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        String[] goods = {"iPhone XS Max", "XIAOMI MIX 3","HUAWEI Mate Pro 20","SAMSUNG Note 9","MacBook Pro 2018"};
        String name = goods[Integer.parseInt(id) - 1];
        String attribute = (String) session.getAttribute(name);
        if (attribute != null) {
            session.setAttribute(name, (Integer.parseInt(attribute) + 1) + "");
        } else  {
            session.setAttribute(name, 1+"");
        }
        response.getWriter().write("add success");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
