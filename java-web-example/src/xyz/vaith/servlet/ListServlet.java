package xyz.vaith.servlet;

import xyz.vaith.bean.Student;
import xyz.vaith.service.StudentService;
import xyz.vaith.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;


@WebServlet(name = "ListServlet", urlPatterns = "/list")
public class ListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService service = new StudentServiceImpl();
        List<Student> list = service.getAll();
        ListIterator<Student> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s);
        }
        request.setAttribute("list", list);
        request.getRequestDispatcher("list.jsp").forward(request, response);

    }
}
