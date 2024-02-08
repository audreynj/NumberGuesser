<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guess the Exact Number</title>
</head>
<body>
 <form action="getGuessExactNumberServlet" method="post">
    Guess a number between 1-10
    <input type="text" name="guessExactNum" size="10">
    <input type="submit" value="Submit" />
 </form>
</body>
</html>