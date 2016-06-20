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
<!-- <script src="jquery.min.js" type="text/javascript"></script>  -->
<script type="text/javascript">

function asd(){
	alert('aksljdasd');
}

function asde(){
	document.getElementById('zonaVar').value = 'zona1';
	document.myForm.submit();
}

$(document).ready(function() {

    //Stops the submit request
    $("#myAjaxRequestForm").submit(function(e){
           e.preventDefault();
    });
   
    //checks for the button click event
    $("#zona1").click(function(e){

    	dataString = $("#zona1").value;	
            //make the AJAX request, dataType is set to json
            //meaning we are expecting JSON data in response from the server
            $.ajax({
                type: "POST",
                url: "JugadoresServlet",
                data: dataString,
                dataType: "String",
               
                //if received a response from the server
                success: function( data, textStatus, jqXHR) {
                    //our country code was correct so we have some information to display
                     if(data.success){
                         $("#response").html("");
                         $("#response").append("<b>Country Code:</b> " + data.id + "<br/>");
                     } 
                     //display error message
                     else {
                         $("#ajaxResponse").html("<div><b>Country code in Invalid!</b></div>");
                     }
                },
               
                //If there was no resonse from the server
                error: function(jqXHR, textStatus, errorThrown){
                     console.log("Something really bad happened " + textStatus);
                      $("#ajaxResponse").html(jqXHR.responseText);
                },
               
     
            });        
    });
    
    $(document).on("click", "#zona1", function() { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
        $.get("JugadoresServlet", function(responseText) {   // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
            $("#somediv").text(responseText);           // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
        });
    });

});

</script>
<form id="myForm" name="myForm" method="POST" action="JugadoresServlet">
	<input type="hidden" name="zonaVar" id="zonaVar">
    Final-AD-Jugadores-MENU
    <table>
        <tr>
            <td>
                <input type="radio" id="zona1" name="zonaR" value="zona1" > Zona 1
                <input type="radio" id="zona2" name="zonaR" value="zona2" onclick="asd()"> Zona 2
            </td>
        </tr>
        <tr>
            <td>
                <select name="response" id="response" >
                	<option>asd</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="radio" name="categoriaR" value="categoria84"> Categoria 84
                <input type="radio" name="categoriaR" value="categoria85"> Categoria 85
            </td>
        </tr>
        <tr>
            <td>
                <input type="radio" name="localidadR" value="local" > Local
                <input type="radio" name="localidadR" value="visitante"> Visitante
            </td>
        </tr>
        <tr>
            <td>
                <button type="button" id="obtenerJugadores" value="obtenerJugadores" onclick="prueba()"> Obtener Jugadores </button>
                <button type="button" id="obtenerPartidos" value="obtenerPartidos"> Obtener Partidos </button>
            </td>
        </tr>
    </table>
    <div id="somediv"></div>
</form>
</body>
</html>
