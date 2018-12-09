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

@WebServlet("/add-form")
public class AddFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //session context
        HttpSession session = request.getSession();

        PrintWriter out = response.getWriter();

        FormService fs = (FormService)getServletContext().getAttribute("app_form");


        Form sForm = null;
        String name = request.getParameter("name");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String frequency = request.getParameter("frequency");
        String selectedComments = "";

        for (String comment : request.getParameterValues("comments")) {
            selectedComments += comment + " ";
        }

        if (session.getAttribute("sess_news") == null) {
            sForm = new Form(name, from, to, frequency, selectedComments);
            fs.addForm(sForm);
        } else {
            sForm = (Form) session.getAttribute("sess_news");
            fs.removeForm(sForm);

            sForm = new Form(name, from, to, frequency, selectedComments);
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