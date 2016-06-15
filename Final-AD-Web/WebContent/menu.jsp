<%--
  Created by IntelliJ IDEA.
  User: martinh
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Final-AD-Jugadores-MENU</title>
</head>
<body>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">


    function prueba(){

        alert('bbbbbbbb');
    }

</script>
<form id="myForm" >
    Final-AD-Jugadores-MENU
    <table>
        <tr>
            <td>
                <input type="radio" id="zona1" name="zonaR" value="zona1" onchange="prueba();"> Zona 1
                <input type="radio" id="zona2" name="zonaR" value="zona2" onclick="prueba();"> Zona 2
            </td>
        </tr>
        <br>
        <tr>
            <td>
                <select name="response" id="response" />
            </td>
        </tr>
        <br>
        <tr>
            <td>
                <input type="radio" name="categoriaR" value="categoria84"> Categoria 84
                <input type="radio" name="categoriaR" value="categoria85"> Categoria 85
            </td>
        </tr>
        <br>
        <tr>
            <td>
                <input type="radio" name="localidadR" value="local" > Local
                <input type="radio" name="localidadR" value="visitante"> Visitante
            </td>
        </tr>
        <br>
        <tr>
            <td>
                <button type="button" id="obtenerJugadores" value="obtenerJugadores" onclick="prueba()"> Obtener Jugadores </button>
                <button type="button" id="obtenerPartidos" value="obtenerPartidos"> Obtener Partidos </button>
            </td>
        </tr>
        <tr>
            <td>
                <input type="radio" id="prueba" value="obtenerJugadores" > prueba </input>
            </td>
        </tr>
        <br>
    </table>
</form>
</body>
</html>
