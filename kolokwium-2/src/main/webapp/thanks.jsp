<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thanks</title>
</head>
<body>
<jsp:useBean id="sess_form" class="pl.kstasiak.domain.RustyNail" scope="session" />

<h1>Dziękujemy za dodanie do koszyka zardzewialego gwozdzia firmy ${sess_form.producer} </h1>
<p>Twoj gwodz zostal wyprodukowany ${sess_form.dateOfProduction} i ma ${sess_form.howLong} cm</p>
<p>Uwagi sklepowe: ${sess_form.comments}</p>
<a href="form.jsp"><button>Zmień zakup</button></a>
<a href="forms"><button>Koszyk</button></a>
</body>
</html>
