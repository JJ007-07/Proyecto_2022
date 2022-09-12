<%-- 
    Document   : registrarCliente
    Created on : 16/08/2022, 06:08:59 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
      
  
      <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
      <script src="js/validarCl.js" type="text/javascript"></script>
</head>
  
<center>
<body>

    <div class="contenedor">      

        <center>
            <h1 class="titulo">Registrar Cliente</h1>
            <form method="post" action="Cliente" onsubmit="return validarCl();">
            <table>
                
                <tr>
                   
                <div class="campos">Nombre Cliente</div>
                <input type="text" id="Nombrecliente" name="TextNombre"><br><br>
                        
                    <div class="campos"> Apellido Cliente</div>
                    <input type="text" id="ApellidoCliente" name="TextApellido"><br><br>

                    <div class="campos">  Tipo Documento</div>
                    <select name="TextTipo" id="TipoDocCliente">
                        <option>Seleccione una opción</option>
                       <option>CC</option>
                       <option>CE</option>
                    </select> <br> <br>
                    
                      <div class="campos">  Numero Documento</div>
                      <input type="number"  id="NumeroDocCliente" name="TextNumDoc"><br><br>
                  
                     <div class="campos">  Telefono Cliente</div>
                     <input type="number" id="TelefonoCliente" name="TextTelefono"><br><br>
                    
                     <div class="campos"> Direccion Cliente</div>
                     <input type="text" id="Direccioncliente" name="TextDir"><br><br>
                    
                      <div class="campos">  Correo Cliente</div>
                      <input type="email" id="CorreoCliente" name="TextCorreo"><br><br>
                    
                      <div class="campos">  Estado Cliente</div>
                      <input type="text" id="EstadoCliente" name="TextEstado"><br><br>
                    
                    
                </tr>
                
                 
                    
                
            </table><br>
           
      
        <div class="form-group">	
        <input type="hidden" value="1" name="opcion" class="btn float-right login_btn">
        <button type="submit" class="btn float-right login_btn" onclick="return confirm('¿Estas seguro de  registrar elcliente')"> Registrarse</button>
        </div>
        </form>
                   
        </center>
      
        </div>
      
          <div class="tres"> 
                         
                                         <% 
                                         if  (request.getAttribute("mensajeError") !=null) {%>
                                         ${mensajeError}           
               
                                         <%}else {%>
                                        ${mensajeExito}  
                                        <%}%>
                                        
                    </div>
    </body>
    </center>
</html>
