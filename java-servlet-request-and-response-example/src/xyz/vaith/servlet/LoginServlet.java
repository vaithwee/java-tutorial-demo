package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //protocol
        request.setCharacterEncoding("UTF-8");

        System.out.println(request.getProtocol());
        System.out.println();

        //header
        System.out.println("header info");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + ":" + value);
        }

        //params
        //中文问题


        System.out.println();
        Map<String, String[]> params = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : params.entrySet()) {
            System.out.println(entry.getKey() + ":" + new String(entry.getValue()[0].getBytes(), "UTF-8"));
        }

        //login
        System.out.println();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equals(username) && "password".equals(password)) {
            response.getWriter().write("登录成功!");
        } else {
            response.getWriter().write("login fail with " + username);
        }
    }
}
