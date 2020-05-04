package servlets;

import util.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Test1Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("value");
        try {
            int i = Integer.parseInt(number)*2;
            response.getWriter().println(i);
            response.setStatus(HttpServletResponse.SC_OK);

        } catch (NumberFormatException | IllegalStateException e) {
            response.getWriter().println(0);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
