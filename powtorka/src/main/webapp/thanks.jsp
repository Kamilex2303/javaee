<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thanks</title>
</head>
<body>
<jsp:useBean id="sess_form" class="pl.kstasiak.domain.Form" scope="session" />

<h1>Dziękujemy za wwypełnienie ankiety ${sess_form.name} </h1>
<p>na temat użytkowania produktu między ${sess_form.from} a ${sess_news.to} (${sess_form.frequency})</p>
<p>Uwagi: ${sess_form.comments}</p>
<a href="form.jsp"><button>Zmień opcje</button></a>
<a href="forms"><button>Wszystkie ankiety</button></a>
</body>
</html>
