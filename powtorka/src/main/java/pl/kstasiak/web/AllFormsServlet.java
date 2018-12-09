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
import java.util.List;

@WebServlet("/forms")
public class AllFormsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        FormService fs = (FormService)getServletContext().getAttribute("app_form");

        List<Form> allForms = fs.getAllForms();

        out.append("<html><body><h2>Wszystkie ankiety:</h2>");

        for (Form form: allForms) {
                out.append("<form action='deleteForm'>");
                out.append("<input type='hidden' name='name' value='" + form.getName() + "'/>");
                out.append("<p>Imie: " + form.getName() + "</p>");
                out.append("<p>Od: " + form.getFrom() + "</p>");
                out.append("<p>Do: " + form.getTo() + "</p>");
                out.append("<p>Czestotliwosc: " + form.getFrequency() + "</p>");
                out.append("<p>Uwagi: " + form.getComments() + "</p>");
                out.append("<input type='submit' value='Usun' />");
                out.append("</form>");
        }

        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        // application context
        getServletContext().setAttribute("app_form", new FormService());
    }
}