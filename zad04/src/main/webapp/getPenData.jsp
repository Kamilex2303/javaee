<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Pen Data</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />
<jsp:useBean id="pen" class="com.example.servletdemo.domain.Pen" scope="session" />

<form action="addPen.jsp">
  Producer: <input type="text" name="producer" value="${pen.producer}" /><br />
  Price: <input type="text"  name="size" value="${pen.size}" /><br />
  Production date: <input type="text"  name="dateOfProduction" value="${pen.dateOfProduction}" /><br />
  Is Reserved: <select name="isBlack"><option value="true">Yes</option><option value="false">No</option></select><br />
  <input type="submit" value=" OK "> 
</form>
</body>
</html>