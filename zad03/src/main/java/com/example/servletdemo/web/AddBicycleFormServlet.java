package com.example.servletdemo.web;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletdemo.service.StorageService;

@WebServlet(urlPatterns = "/add-pen")
public class AddBicycleFormServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
		
		int size = ss.getAllPens().size() +1;
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Add a pen</h2>" +
				"<form action='data-pen'>" +
				"ID: <input type='text' name='id' value="+size+" /> <br />" +
				"Producer: <input type='text' name='producer' /> <br />" +
				"Is black: <input type='checkbox' name='isBlack' /> <br />" +
				"Date of production: <input type='text' name='date' /> <br />" +
				"Size: <input type='text' name='size'/><br/>"+
				"<input type='submit' name='add' value=' OK ' /></form>" +
				"</body></html>");
		out.close();
	}
}