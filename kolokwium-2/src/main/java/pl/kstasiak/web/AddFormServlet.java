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

@WebServlet("/add-form")
public class AddFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //session context
        HttpSession session = request.getSession();

        PrintWriter out = response.getWriter();

        FormService fs = (FormService)getServletContext().getAttribute("app_form");


        RustyNail sForm = null;
        String producer = request.getParameter("producer");
        String dateOfProduction = request.getParameter("dateOfProduction");
        double howLong = Double.parseDouble(request.getParameter("howLong"));
        String selectedComments = "";

        for (String comment : request.getParameterValues("comments")) {
            selectedComments += comment + " ";
        }

        if (session.getAttribute("sess_news") == null) {
            sForm = new RustyNail(producer, dateOfProduction, howLong, selectedComments);
            fs.addForm(sForm);
        } else {
            sForm = (RustyNail) session.getAttribute("sess_news");
            fs.removeForm(sForm);

            sForm = new RustyNail(producer, dateOfProduction, howLong, selectedComments);
            fs.addForm(sForm);
        }


        session.setAttribute("sess_form", sForm);

        response.sendRedirect("thanks.jsp");
    }

    @Override
    public void init() throws ServletException {

        // application context
        getServletContext().setAttribute("app_form", new FormService());
    }
}