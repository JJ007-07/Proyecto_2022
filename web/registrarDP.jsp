<%-- 
    Document   : registrarDP
    Created on : 9/08/2022, 07:51:28 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/validarDP.js"></script>
        <title>Registrar</title>
    </head>
    <body>
        <center>
        <h1>Registrar Detalle Pedido</h1>
        <form method="post" action="DetallePedido" onsubmit="return validarDP();">
            <table>
                <tr>Id pedido FK<br>
                <input type="number" id="IdPedidoFK" name="textIdPedidoFK"><br>
                <tr>Id Producto FK<br>
                <input type="number" id="IdProductoFK" name="textIdProductoFK"><br>
                </tr>
                <tr>Precio Unidad<br>
                <input type="number" id="PrecioUnitario" name="textPrecio"><br>
                </tr>
                <tr>Cantidad<br>
                <input type="number" id="Cantidad"  name="textCantidad"><br>
                </tr>
            </table><br>
            
            <input type="hidden"value="1"  name="opcion" >
            <button onclick="return confirm('¿Estas seguro de  registrar este pedido')">Registrar detalle pedido</button>
        </form><br>
        <%
        if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%>
        
        
       
        </center>
    </body>
</html>
