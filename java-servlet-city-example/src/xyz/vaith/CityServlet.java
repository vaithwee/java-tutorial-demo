package xyz.vaith;

import com.thoughtworks.xstream.XStream;
import net.sf.json.JSONArray;
import xyz.vaith.bean.City;
import xyz.vaith.service.CityService;
import xyz.vaith.service.impl.CityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CityServlet", urlPatterns = "/city")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pid = Integer.parseInt(request.getParameter("pid"));
        CityService service = new CityServiceImpl();
        List<City> cities = null;
        try {
            cities = service.getAllCity(pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (City city : cities) {
            System.out.println(city);
        }

//        XStream xStream = new XStream();
//        xStream.alias("city", City.class);
//        String xml =  xStream.toXML(cities);
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("text/xml;charset=utf-8");
//        response.getWriter().write(xml);

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/json;charset=utf-8");
        JSONArray jsonArray = JSONArray.fromObject(cities);
        String json = jsonArray.toString();
        response.getWriter().write(json);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
