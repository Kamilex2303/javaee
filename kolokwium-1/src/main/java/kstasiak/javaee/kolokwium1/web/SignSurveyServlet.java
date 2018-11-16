package kstasiak.javaee.kolokwium1.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kstasiak.javaee.kolokwium1.domain.Survey;
import kstasiak.javaee.kolokwium1.service.SurveyService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/complete-survey")
public class SignSurveyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String selectedDescription = null;
        Survey survey = null;
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        SurveyService ns = (SurveyService)getServletContext().getAttribute("app_news");
        int id = Integer.parseInt(request.getParameter("id"));
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String frequency = request.getParameter("frequency");
        String description = "";

        for (String subject : request.getParameterValues("description")) {
        	selectedDescription = description + " ";
        }

        if (session.getAttribute("sess") == null) {
        	survey = new Survey(id ,from, to, frequency, selectedDescription);
            ns.addSurvey(survey);
        } else {
        	survey = (Survey) session.getAttribute("sess");
            ns.removeSurvey(survey);
            survey = new Survey(id, from, to, frequency, selectedDescription);
            ns.addSurvey(survey);
        }
        session.setAttribute("sess", survey);
        response.sendRedirect("succes.jsp");
    }

    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute("app_news", new SurveyService());
    }
}