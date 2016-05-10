<%-- 
    Document   : actividades
    Created on : 10-may-2016, 17:38:49
    Author     : Vicente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css" type="text/css"/>
        <link rel="stylesheet" href="pruebacss.css" type="text/css"/>

        <title>Asociacion para la defensa de los animales</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/banner.js"></script>
        <script src="js/desplegable.js"></script>

    </head>
    <body>
    
        <header >
            <img src="Imagenes/logo.png" alt="Logo">
            <nav>
                <ul>
                    <li><a href="index.html">Inicio</a></li>
                    <li><a href="sobre_nosotros.html">Sobre nosotros</a></li>
                    <li><a href="noticias.html">Noticias</a></li>
                    <li><a href="" style="background-color: white">Actividades</a></li>
                    <li><a href="apunt_donacion.html">Apuntate/Donaciones</a></li>
                    <li><div class="dropdown">
                        <a onclick="myFunction()" class="dropbtn">Login miembros</a>
                        <div id="myDropdown" class="dropdown-content">
                            <form name="login" action="admin/area-usuario.html" method="POST">
                            <input type="text" class="input-login" name="usuario"  maxlength="50">
                            <input type="password" class="input-login" name="contrasena" maxlength="50">
                            <input type="submit" value="Login"  name="enviar" />
                            </form>
                        </div>
                        </div>
                    </li>
                </ul>
            </nav>
        </header>
        <%@page import="pac.Actividades" %>
        <%
            String[] titA = new String[6];
            String[] imgA = new String[6];
            String[] urlA = new String[6];
            Actividades a;
            a=new Actividades();
            titA = a.getTitA6();
            imgA = a.getImgA6();
            urlA = a.getUrlA6();
        %>
        <div id="cuerpo">
            <div id="columnaFiltro">
                <div id="filtros">
                    <div class="selector"><h4>FILTRAR POR:</h4></div>
                    <div class="selector">
                    Lugar:<select>
                        <option value="0">- - - - - -</option>
                        <option value="1">Valladolid</option>
                        <option value="2">Barcelona</option>
                        <option value="3">Sevilla</option>
                        <option value="4">Madrid</option>
                    </select>
                    </div>
                    <div class="selector">
                    Tipo:<select>
                        <option value="0">- - - - - -</option>
                        <option value="1">Recogida de bienes</option>
                        <option value="2">Actuación benéfica</option>
                        <option value="3">Mercadillo</option>
                        <option value="4">Manifestación</option>
                    </select>
                    </div>
                    <div class="selector"><h4>BUSQUEDA:</h4></div>
                    <div class="selector">
                        <input type="text" value="" maxlength="30" />
                        <input type="submit" value="Buscar" />
                    </div>
                </div>
            </div>
        <section class="content" id="content3">
            <div id="lineaPrincipal"><h2>Actividades</h2></div>
            <div class="contenedor" id="cont4">
                <a href=<%=urlA[0]%>><div class="cuadro2" >
                    <img src=<%=imgA[0]%>>
                    <div class="footcuadro"><h4><%=titA[0]%></h4></div>
                    </div></a>
                <a href=<%=urlA[1]%>><div class="cuadro2" >
                    <img src=<%=imgA[1]%>>
                    <div class="footcuadro"><h4><%=titA[1]%></h4></div>
                </div>
                <a href=<%=urlA[2]%>><div class="cuadro2" >
                    <img src=<%=imgA[2]%>>
                    <div class="footcuadro"><h4><%=titA[2]%></h4></div>
                </div>
                <a href=<%=urlA[3]%>><div class="cuadro2" >
                    <img src=<%=imgA[3]%>>
                    <div class="footcuadro"><h4><%=titA[3]%></h4></div>
                </div>
                
                <a href=<%=urlA[4]%>><div class="cuadro2" >
                    <img src=<%=imgA[4]%>>
                    <div class="footcuadro"><h4><%=titA[4]%></h4></div>
                </div>
                <a href=<%=urlA[5]%>><div class="cuadro2" >
                    <img src=<%=imgA[5]%>>
                    <div class="footcuadro"><h4><%=titA[5]%></h4></div>
                </div>
            </div>
        </section>
        </div>
        <footer>Pie de pagina</footer>
    </body>
</html>
