<%-- 
    Document   : agecalculator
    Created on : 1-Feb-2022, 6:40:22 PM
    Author     : Raj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>AgeCalculator</h1>
          <form action="age" method="post" >
            <label> Enter your age:</label>
            <input type="text" name="ageGiven">
            <br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <a href="/Calculators/arithmetic">Arithmetic Calculator</a>
        
        <p>${ageNext}<p>
               <p>${message}<p>
    </body>
</html>
