<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ankieta</title>
</head>
<body>

<h1>Dodaj ankiete:</h1>
<form action="add-form">
    <label for="name">Imie:</label>
    <input type="text" name="producer" id="priducer" required="required" value="${sess_form.name}"><br>

    <label for="from">Od daty:</label>
    <input type="text" name="dateOfProduction" id="dateOfProduction" required="required" value="${sess_form.from}"><br>

    <br><label>Częstotliwość:</label><br>
    <input type="radio" name="frequency" value="codziennie">Codziennie<br>
    <input type="radio" name="frequency" value="co tydzien">Co tydzień<br>
    <input type="radio" name="frequency" value="co miesiac">Co miesiąc<br>

    <br><label >Twoje uwagi:</label><br>
    <input type="checkbox" name="comments" value="tusz">tusz<br>
    <input type="checkbox" name="comments" value="material">materiał<br>
	<input type="checkbox" name="comments" value="ogolne">ogolne<br>
    <input type="submit" value="Dodaj">
</form>

</body>
</html>