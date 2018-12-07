<%@page import="com.example.servletdemo.domain.Pen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All pens</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />
<%
for (Pen pen: storage.getAllPens()) {
	out.println("<p>Id: " + pen.getId() + "</p>");
	out.println("<p>Producer: " + pen.getProducer() + "</p>");
	out.println("<p>Price: " + pen.getSize() + "</p>");
	out.println("<p>Is Reserved: " + pen.isBlack() + "</p>");
	out.println("<form action='getPenData'><input type='hidden' name='add' value='" + pen.getId() +"' ><button type='submit'>Add to cart</button></form>");
}
%>
<p>
  <a href="addGuitarData.jsp">Add another pen</a>
</p>
</body>
</html>