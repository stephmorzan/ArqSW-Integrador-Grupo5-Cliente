<%-- 
    Document   : login
    Created on : 27/06/2016, 11:21:04 AM
    Author     : EQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login: DulceReal</title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/normalize.css">

</head>
<body>

<div class="row">
    <div class="large-centered large-6 large-offset-3 columns">
    <h1>Inicia Sesión</h1>
    </div>
</div>

<div class="row">
    
<form action="login" method="post">

<div class="large-centered large-8 large-offset-2 columns">
<div class="panel">
    <div class="row">
    <div class="column large-8 large-offset-2 small-12">
    Usuario: <input type="text" name="usuario">
    <br>
    Contraseña: <input type="password" name="clave">
    </div>
    </div>

    <div class="row">
        <div class="large-6 large-offset-3 small-6 columns">
            <input type="submit" value="Ingresar" onclick="login()">
        </div>
    </div>

</div>

    <br>
    
</div>

</form>
</div>

</body>

<script src="js/vendor/jquery.js"></script>
<script src="js/foundation.min.js"></script>
<script>
    $(document).foundation();
    function login(){
        var usuario = document.getElementsByTagName("usuario")
        var clave = document.getElementByTagName("clave");
        if (usuario === "" || clave === ""){
            document.getElementById("aviso").innerHTML = "Por favor, llenar todos los campos de datos.";
            alert("Por favor, llenar todos los campos de datos.");
        }
    }
</script>
</html>