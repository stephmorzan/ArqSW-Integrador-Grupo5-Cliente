<%-- 
    Document   : respuesta
    Created on : 27/06/2016, 11:21:29 AM
    Author     : EQ
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="rpta" scope="session" value="${sessionScope.rpta}"/>
        <title>Respuesta</title>
        <link rel="stylesheet" href="css/foundation.css">
  <link rel="stylesheet" href="css/normalize.css">
    </head>
    <body>
        <div class="row">
            <br>
            <div class="large-12 large-centered columns">
        <h4>${rpta}</h4>
        </div>
        <br>
        <a href="tablaPedido.jsp">Regresar</a>
        </div>
    </body>
</html>
