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
import java.util.List;

@WebServlet("/surveys")
public class AllSurveysServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        SurveyService ns = (SurveyService)getServletContext().getAttribute("app");
        List<Survey> allSurveys = ns.getAllSurveys();
        out.append("<html><body><h2>Wszystkie ankiety:</h2>");
        for (Survey survey: allSurveys) {
                out.append("<form action='deleteSurvey'>");
                out.append("<p>Id:" + survey.getId() + "</p>");
                out.append("<p>Od: " + survey.getFrom() + "</p>");
                out.append("<p>Do: " + survey.getTo() + "</p>");
                out.append("<p>Czestotliwosc: " + survey.getFrequency() + "</p>");
                out.append("<p>Uwagi: " + survey.getDescription() + "</p>");
                out.append("<input type='submit' value='Usun' />");
                out.append("</form>");
        }

        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute("app", new SurveyService());
    }
}