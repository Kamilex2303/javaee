package com.example.servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletdemo.domain.Pen;
import com.example.servletdemo.service.StorageService;

@WebServlet(urlPatterns = "/all-pens")
public class AllBicyclesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
	
		List<Pen> allPens = ss.getAllPens();

		out.append("<html><body><h2>All pens:</h2>");

		for (Pen pen: allPens) {
			out.append("<p>Id: " + pen.getId() + "</p>");
			out.append("<p>Producer: " + pen.getProducer() + "</p>");
			out.append("<p>Is black: " + pen.isBlack() + "</p>");
			out.append("<p>Date of production: " + pen.getDataOfProduction() + "</p>");
			out.append("<p>Is Reserved: " + pen.getSize() + "</p>");
			out.append("<form action='data-cart'><input type='hidden' name='add' value='" + pen.getId() +"' ><button type=submit>Add to shopping cart</button></form>");
		}

		out.append( "</br><li><a href='index'>Index</a></li>");
		out.append("</body></html>");
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}
}