<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align ="center">Registro</h1>
        
        <form action="recibir.do" method="POST">
            <center>
                <table border="0">
                    <tr>
                        <td> <label>Ingrese su Numero de DUI: </label> </td>
                        <td><input type="text" name="dui" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                    </tr> <tr>
                        <td> <label>Ingrese su Nombre: </label> </td>
                        <td><input type="text" name="nombres" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                        </tr><tr>
                         <td> <label>Ingrese sus Apellidos: </label> </td>
                        <td><input type="text" name="apellidos" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                    </tr>
                        <td> <label>Ingrese su Numero de Telefono: </label> </td>
                        <td><input type="text" name="Telefono" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                    <tr>
                        <td> <label>Ingrese su Direccion: </label> </td>
                        <td><input type="text" name="Direccion" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                     </tr>
                     <tr>
                        <td> <label>Ingrese su Correo: </label> </td>
                        <td><input type="text" name="email" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                    </tr>
                 
                        <td> <label>Ingrese el Tipo: </label> </td>
                        <td><input type="text" name="tipo" value=""  autocomplete="false" required="true" size="30" max="30"/> </td>
                    <tr> <td colspan='2' align='center'> </tr>
                              <tr> <td colspan='2' align='center'> </tr>
                                       <tr> <td colspan='2' align='center'> </tr>
                    <tr> <td colspan='2' align='center'> 
                            <input type="submit" name="send" value="Registrar Persona" />
                        </td>
                    </tr>
                </table></center>
        </form>
    </body>
</html>

