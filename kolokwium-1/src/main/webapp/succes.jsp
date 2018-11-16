<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thanks</title>
</head>
<body>
<jsp:useBean id="sess" class="kstasiak.javaee.kolokwium1.domain.Survey" scope="session" />

<h1>Dziękujemy za wypełnienie ankiety o id ${sess.id} </h1>

<a href="survey.jsp"><button>zmień ankiete</button></a>
<a href="survey"><button>Wszystkie ankiety</button></a>

</body>
</html>
