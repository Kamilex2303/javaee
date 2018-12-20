package pl.kstasiak.web;

import pl.kstasiak.domain.RustyNail;
import pl.kstasiak.service.FormService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@WebServlet("/deleteForm")
public class DeleteNewsletterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        FormService fs = (FormService)getServletContext().getAttribute("app_form");

        List<RustyNail> allForms = fs.getAllForms();

        String name = request.getParameter("producer");

        for (Iterator<RustyNail> iter = allForms.listIterator(); iter.hasNext(); ) {
            RustyNail a = iter.next();
            if (a.getProducer().equals(name)) {
                iter.remove();
                out.append("<p>Usunieto z koszyka</p>");
            }
        }

        out.append("<a href='forms'>Przenies do koszyka</a>");
        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        // application context
        getServletContext().setAttribute("app_form", new FormService());
    }
}