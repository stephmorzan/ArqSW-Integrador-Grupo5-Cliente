<%-- 
    Document   : tablaPedido
    Created on : 27/06/2016, 11:21:20 AM
    Author     : EQ
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.clases.Producto"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="usuario" scope="session" value="${sessionScope.usuario}"/>
        <title>Catálogo DulceReal</title>
        <link rel="stylesheet" href="css/foundation.css">
  <link rel="stylesheet" href="css/normalize.css">
    </head>
    <body>
        
        <div class="row">
<form action="pedido" method="post">
<div class="large-12 large-centered columns">
    
    <h1>Haz tu pedido</h1>
    <br>
    <h4>Seleccione los productos de nuestro catálogo:</h4>
</div>
<br>
    <div class="large-2 columns"></div>
    
    <div class="large-10 large-centered columns">
        
        <table style="width: 100%">
      <tr>
          <th></th>
          <th>ID</th>
          <th>Nombre del Producto</th>
          <th>Precio S/.</th>
          <th>Cantidad</th>

      </tr>
      
      <%List<Producto> productos = (ArrayList<Producto>)session.getAttribute("productos");
      for (Producto p: productos){ %>
          
    <tr>
        <td><input type="checkbox" name="product" value="<%= p.nombreProducto%>"></td>
        <td><%out.print(p.idProducto);%></td>
      <td><%out.print(p.nombreProducto);%></td>
      <td><%out.print(p.precioProducto);%></td>
      <td><select name="cantidad <%= p.idProducto%>">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
</select></td>

    </tr>
    <%}%>
    
  </table>

</div>
    
    <div class="large-2 columns"></div>
    <div class="large-2 large-centered columns">
        <input type="submit" value="Hacer pedido"/>
    </div>
</form>
</div>
        
    </body>
</html>
