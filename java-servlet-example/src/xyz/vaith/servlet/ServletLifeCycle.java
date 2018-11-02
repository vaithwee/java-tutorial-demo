package xyz.vaith.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletLifeCycle implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init servlet");
    }

    @Override
    public void destroy() {
        System.out.println("destory servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this handle any request");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }


}
