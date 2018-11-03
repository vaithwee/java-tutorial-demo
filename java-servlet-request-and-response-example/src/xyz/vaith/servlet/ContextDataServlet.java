package xyz.vaith.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContextDataServlet", urlPatterns = "/cds")
public class ContextDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Object count = context.getAttribute("count");
        int c = 0;
        if (count != null) {
            c = (int)count;
            c++;
        } else  {
            c = 1;
        }
        System.out.println("current count is " + c);
        context.setAttribute("count", c);
    }
}
