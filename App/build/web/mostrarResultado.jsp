<%-- 
    Document   : mostrarResultado
    Created on : 8 sep. 2022, 22:38:10
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="model.Triangulo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estos son los resultados</h1>
        <%
            
            Triangulo t = (Triangulo) request.getAttribute("Operaciones");
            
        %>
        
        Valor del área es: <%=t.getResult()%><br><br>
        Valor del perimetro es: <%=t.getResulta()%><br><br>
        <form action="${pageContext.request.contextPath}/index.jsp" method="post">
            <input type="submit" value="Back"/>
        </form>
    </body>
</html>
