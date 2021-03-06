package pl.kstasiak.web;

import pl.kstasiak.domain.Form;
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

        List<Form> allForms = fs.getAllForms();

        String name = request.getParameter("name");

        for (Iterator<Form> iter = allForms.listIterator(); iter.hasNext(); ) {
            Form a = iter.next();
            if (a.getName().equals(name)) {
                iter.remove();
                out.append("<p>Usunieto ankiete</p>");
            }
        }

        out.append("<a href='forms'>Przenies do wszystkich ankiet</a>");
        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        // application context
        getServletContext().setAttribute("app_form", new FormService());
    }
}