<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String senal=request.getParameter("chi");
    String d_persona=request.getParameter("dui");
    String n_persona=request.getParameter("nombre");
    String a_persona=request.getParameter("apellidos");
    
    if(senal!=null){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%//@include file="header.jsp"%>
        <jsp:include page="header.jsp"/>
        <title>JSP Page</title>
    </head>
    <body>
        <BR>
        <div class="container">
            <div class="row">
                <form class="col s12" action="modificar.do" method="POST">
                    <input type="hidden" name="dui" id="dui" value="<%=d_persona %>">
                    <div class="col s12 m6 offset-m3">
                        <div class="card z-depth-5">
                            <div class="card-action teal lighten-8 white-text blue-grey">
                                <span class="white-text text-darken-1"><h5>Registro persona (Actualización)</h5></span>
                                    </div>
                            
            <div class="card content">
                <div class="input-field col s12">
                    <i class="material-icons prefix">account_circle</i>
                        <input id="dui1" name="dui1" readonly="true" disabled type="text" value="<%=d_persona %>" class="validate" required="">
                            <label for="dui1">Ingrese Numero de DUI</label>
                                </div>
                           
                <div class="input-field col s12">
                    <i class="material-icons prefix">person</i>
                        <input id="nombre" name="nombre" type="text" value="<%= n_persona %>" class="validate" required>
                            <label for="nombre">Ingrese Nombres</label>
                                </div>
                                    
                    <div class="input-field col s12">
                        <i class="material-icons prefix">person_add</i>
                            <input id="apellidos" name="apellidos" type="text" value="<%= a_persona %>" class="validate" required>
                                <label for="apellidos">Ingrese Apellidos</label>
                                    </div>
                                    
                        <div class="row"></div>
                            <div class="container" center col s12>
                                <div class="center">
                                    <button style="width: 100%;" class="btn waves-effect waves-light col s6 red" type="submit" name="modificar">Actualizar Registro
                                        <i class="material-icons left">refresh</i>
                                            </button>
                                                </div>
                                
                            <div class="row"></div>
                                <div >
                                    <a style="width: 100%;" href="mostrar.do" class="btn btn blue" title="Retornar">
                                        <i class="material-icons small left">undo</i>Retornar</a>
                                            </div>
                                                </div>
                                <div class="row"></div>
                                    <%
                                        try{
                                            String bandera=request.getParameter("modificado");
                                            if (bandera.equals("exito")){
                                    %>
                                    
                                    <div class="row">
                                        <div class="col s12 blue">
                                            <span class="flow-text center"><h6>Registro Actualizado Correctamente!</h6></span>
                                                </div>
                                                    </div>
                                    
                                    <%
                                        }else if(bandera.equals("error")){
                                    %>
                                    
                                    <div class="row">
                                        <div class="col s12 small">
                                            <span class="flow-text">Error. No se actualizarón los datos</span>
                                                </div>
                                                    </div>
                                    
                                    <%
                                        }
                                            }catch(Exception ex){
                                        }    
                                    %>
                                    
                                    </div>
                                        </div>
                                            </div>
                                                </form>
                                                    </div>
                                                        </div>
                                                        
                                    <%
                                    }else{
                                              out.print("Operación Incorrecta....");
                                             }
                                    %>
                                    
                                    <%@ include file="footer.jsp" %>
                                                                  
    </body>
</html>

