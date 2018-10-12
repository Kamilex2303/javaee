package com.example.kamilstasiak.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class AboutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>"
				+ "<h3>Kamil Stasiak</h3>"
				+ "<p>Uniwersytet Gdanski</p>"
				+"<p>Wydzial MFI</p>"
				+ "<p>Informatyka</p>"
				+ "<h2>Hobby i zainteresowania: </h2>"
				+ "<ul>"
				+ "<li>Pilka nozna</li>"
				+ "<li>Podrózowanie</li>"
				+ "</ul>"
				+ "</body></html>");
		//out.close();
	}
}
