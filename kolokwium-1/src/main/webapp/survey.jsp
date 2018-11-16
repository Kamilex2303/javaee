<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ankieta</title>
</head>
<body>

<h1>Wypełnianie ankiet:</h1>
<form action="complete-survey">
    <label for="id">Id:</label>
    <input type="text" name="id" id="id" required="required" value="${sess.id}"><br>

    <label for="from">Od:</label>
    <input type="text" name="from" id="from" required="required" value="${sess.from}"><br>

    <label for="to">Do:</label>
    <input type="text" name="to" id="to" required="required" value="${sess.to}"><br>

    <br><label>Częstotliwość korzystania z produktu:</label><br>
    <input type="radio" name="frequency" value="codziennie">Codziennie<br>
    <input type="radio" name="frequency" value="co tydzien">Raz w tygodniu<br>
    <input type="radio" name="frequency" value="co miesiac">Kilka razy w tygodniu<br>

    <br><label >Uwagi(zaznacz opcje która Ci sie nie podobała)</label><br>
    <input type="checkbox" name="subjects" value="tusz">Zła jakość tuszu<br>
    <input type="checkbox" name="subjects" value="wykonanie">Złe dobrane materiały<br>
    <input type="checkbox" name="subjects" value="wygoda">Źle lerzy w dłoni<br><br>

    <input type="submit" value="Zapisz się">
</form>
<a href="survey"><button>Wszystkie ankiety</button></a>
</body>
</html>