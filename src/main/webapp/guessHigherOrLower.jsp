<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guess Higher or Lower</title>
</head>
<body>
 <form action="getHigherOrLowerServlet" method="post">
    Do you think the number is LOWER or HIGHER(Equal) to 5?
    <input type="text" name="higherOrLower" size="10">
    <input type="submit" value="Submit" />
 </form>
</body>
</html>