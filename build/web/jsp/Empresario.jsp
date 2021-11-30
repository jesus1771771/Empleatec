<%-- 
    Document   : Empresario
    Created on : 22/09/2021, 02:11:07 PM
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!-- Vamos a inciar el cuerpo de la información a solicitar -->
        <form  method="get" action="RegistroEmpresario" >
            <section class="container">
                <h2>Datos del Empresario</h2>
                <div>
                    <s:label> Nick: </s:label>
                        <input type="text" maxlength="20" name="nickUsr" placeholder="Juárez"> 
                        <br/>
                     <s:label >Nombre(s):</s:label>
                        <input type="text" maxlength="70" name="nombreUsr">
                        <br/>
                    <s:label> Apellido Paterno: </s:label>
                        <input type="text" maxlength="70" name="apaternoUsr" placeholder="Juárez"> 
                        <br/>
                    <s:label >Apellido Paterno:</s:label>
                        <input type="text" maxlength="70" name="amaternoUsr">
                        <br/>
                        <s:label >Correo:</s:label>
                    <input type="text" maxlength="70" name="correoUsr">
                    <br/>
                    <s:label >Teléfono:</s:label>
                        <input type="text" maxlength="70" name="telefonoUsr">
                        <br/>
                    
                    <s:label >Contraseña:</s:label>
                        <input type="text" maxlength="10" name="passwdUsr">
                        <br/>
                    <input type="submit" value="Registrarme" >
                </div>

            </section>


        </form>
                        
                        
                        <form action="ConsultaGeneralE">
                            
                            <input type="submit" value="Mostrar empresarios">
                            
                        </form>
                        
                        
                        
                    <h3>Nuestros Empresarios</h3>
                    <!-- Se realiza la presentación de esta información 
                    cuando se carga sin necesidad de iniciar sesión -->
                    
                    <s:iterator value="Empresario" status="rowStatus">
                       <s:property value="nickUsr"/>
                        
                        <s:property value="nombreUsr"/>
                        
                        <s:property value="apaternoUsr"/>
                        <s:property value="amaternoUsr"/>
                        <s:property value="telefonoUsr"/>
                        <s:property value="correoUsr"/>
                        <s:property value="passwdUsr"/>
                        <s:property value="fregistro"/>
                     <br/>
                     
                    </s:iterator>
                    
                     
                    <!-- Colocar una lista desplegable de un arreglo
                    de las empresas de un empresarios-->
                    <form action="ListadoEmpresario" method="post">
                <s:select label= "Clave o nombre de la empresa"
                          headerKey="-1" 
                          headerValue="--Seleccionar la empresa --"
                          list="Empresario" name="nickUsr" listKey="nickUsr"
                          listValue="nombreUsr">
                    <s:property value="nickUsr"/>
                          </s:select>
                    
                
                    
                </form> 
                <!--Sección demodificación-->
               
                
                <!-- Busqueda de datos -->
                <form action="BuscaEmpresario" method="post">
                    <h3>Introduce el nick del empresario a buscar:</h3>
                    <input type="text" maxlength="10" name="nickUsr"/>
                    <br/>
                    <input type="submit" value="Busca Nick del Empresario"/>
                    <br/>
                    
                    
                    
                </form>
                
               
                
                <h3> Datos a Modificar</h3>
                <form action="ModificaDatosEmpresario" method="post" >
                <s:textfield label="Nick del Empresario" name="nickUsr" readonly="true"/>
                <s:textfield label="Nombre"
                             name="nombreUsr" />
                <br/>
                <s:textfield label="Apellido Paterno"
                             name="apaternoUsr"/>
                <br/>
                <s:textfield label="Apellido Materno"
                             name="amaternoUsr"/>
                <br/>
                <s:textfield label="Teléfono"
                             name="telefonoUsr"/>
                <br/>
                <s:textfield label="Correo" name="correoUsr"/>
                <br/>
                <s:textfield label="Contraseña: " name="passwdUsr"/>
                <br/>
                <s:textfield label="Fecha de registro" name="fRegistro" readonly="true"/>
                <br/>
                <input type="submit" value="Actualizar datos"/>
                </form>
                
                 <form action="EliminaUsuario" method="get">
                    <h3>Introduce el nick del empresario a buscar:</h3>
                    <input type="text" maxlength="10" name="nickUsr"/>
                    <input type="submit" value="Elimina Usuario">
                </form>
                    
    </body>
</html>
