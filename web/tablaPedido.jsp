<%-- 
    Document   : tablaPedido
    Created on : 27/06/2016, 11:21:20 AM
    Author     : EQ
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="usuario" scope="session" value="${sessionScope.usuario}"/>
        <!--<c:set var="productos" scope="session" value="${sessionScope.productos}"/>-->
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
      <!--<c:forEach var="i" begin="0" end="80">
    <tr>
        <td><input type="checkbox" name="product" value="${productos.get(i).nombreProducto}"></td>
        <td><c:out value="${productos.get(i).idProducto}"/></td>
      <td><c:out value="${productos.get(i).nombreProducto}"/></td>
      <td><c:out value="${productos.get(i).precioProducto}"/></td>
      <td><select>
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
    </c:forEach>-->
    <tr>
        <th><input type="checkbox" name="product" value="algo"></th>
        <td>1</td>
      <td>Jill</td>
      <td>50</td>
      <td><select>
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
</select>
      </td>

    </tr>
    <tr>
        <td><input type="checkbox" name="product" value="algo"></td>
        <td>2</td>
      <td>Eve</td>
      <td>94</td>
      <td><select id="cantidad">
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
