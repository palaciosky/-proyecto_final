<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrartodo 
    Created on : May 16, 2019, 9:42:54 AM
    Author     : zc201
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%//@ include file="header.jsp"%>
        <jsp:include page= "header.jsp"/>
        <title>JSP Page</title>
        
    </head>
    <body>
    <center><h1>Todos los registros</h1></center>
    <center>
        <div class="container">
            <table id="example" class="display higlight" cellspacing="0" width="100%">
                <thead>
                    <tr>
                        <th>Dui de la perosna</th>
                        <th>Nombre de la perosna</th>
                        <th>Apellidos de la persona</th>
                        <th class="center">+Operaciones</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th class="center"></th>
                    </tr>
                </tfoot>
                <tbody>
                    <% 
                        int contador = 0;
                        String color="sky-blue";
                    %>
                    <c:forEach var="listaTotal" items="${sessionScope.persona}">
                        <%
                            contador++;
                        %>
                        <tr>
                            <td>${listaTotal.dui}</td>
                            <td>${listaTotal.apellidos}</td>
                            <td>${listaTotal.nombres}</td>
                            <td class="center">
                                
                                <a href="mod_Persona.jsp?chi='modificar'&&dui=${listaTotal.dui}&&nombre=${listaTotal.apellidos}&&apellidos=${listaTotal.nombres}" class="btn btn-floating teal modal-triger" title="Modificar Registro">
                                    <i class="material-icons blue-grey">border_color</i>
                                </a>
                                <a href="mostrartodo.jsp?dui=${listaTotal.dui}" class="btn btn-floating" title="Borrar Registro">
                                    <i class="material-icons red">delete_forever</i>
                                </a>    
                                    
                            </td>
                    </tr>
                </c:forEach>
            </tbody>
            </table>
        </div>
                
                <center>
                    <h6>Total Registros Encontrados: <%=contador%></h6>
                </center>
                <%
                try{
                    String dui = request.getParameter("dui");
                    if(!dui.isEmpty() && dui != null){
                    String url_cancel = "mostrartodo.jsp";
                    String url_ok = "borrar.do?si=1&&dui="+dui;
                       out.println("<script>valor=confirm(\"Realmente desea borrar el registro? "+ dui + " \\n\\nClic en aceptar para confirmar. \");valor;"
                        + "if (valor==true) {"
                        + "location.href='"+ url_ok + "';"
                        + ")else("
                        + "location.href='"+ url_cancel + "';"
                        + "}"
                        + "</script>");
                    }
                }catch (Exception e){

}
%>
<%@ include file="footer.jsp" %>
    </body>
</html>
