<%-- 
    Document   : index
    Created on : 8 sep. 2022, 22:33:30
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="controlador.mostrarOperaciones" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Actividad 4</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div> Hola querido usuario
        <form action="mostrarOperaciones" method = "post">
            <br>Digite el valor de la base:
            <input type = "text" name="B" value=""><br>
            <br>Digite el valor de la altura:
            <input type= "text" name="H" value=""><br><br>
            <input type= "submit" value="Magia!">
            </form>
        </div>
    </body>
</html>
