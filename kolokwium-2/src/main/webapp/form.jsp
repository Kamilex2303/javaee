<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Zakupy</title>
</head>
<body>

<h1>Dodaj produkt do koszyka:</h1>
<form action="add-form">
    <label for="producer">Producent:</label>
    <input type="text" name="producer" id="priducer" required="required" value="${sess_form.producer}"><br>

    <label for="from">Data produkcji:</label>
    <input type="text" name="dateOfProduction" id="dateOfProduction" required="required" value="${sess_form.dateOfProduction}"><br>

    <br><label>Dlugosc:</label><br>
    <input type="radio" name="howLong" value="2.0">2 cm<br>
    <input type="radio" name="howLong" value="3.0">3 cm<br>
    <input type="radio" name="howLong" value="4.0">4 cm<br>

    <br><label >Twoje uwagi:</label><br>
    <input type="checkbox" name="comments" value="wiecej gwozdzi">Moglo by byc ich wiecej w sklepie<br>
    <input type="checkbox" name="comments" value="dluzsze gwozdzie">Moglo by byc wiecej dlugosci gwozdzi<br>
    <input type="submit" value="Dodaj do koszyka">
</form>

</body>
</html>