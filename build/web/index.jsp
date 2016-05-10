<%-- 
    Document   : index
    Created on : 10-may-2016, 11:55:44
    Author     : Vicente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <link rel="stylesheet" href="style.css" type="text/css"/>
        <link rel="stylesheet" href="pruebacss.css" type="text/css"/>

        <title>Asociacion para la defensa de los animales</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/desplegable.js"></script>
    </head>
    <body>
        <header >
            <img src="Imagenes/logo.png" alt="Logo">
            <nav>
                <ul>
                    <li><a href="" style="background-color: white">Inicio</a></li>
                    <li><a href="sobre_nosotros.html">Sobre nosotros</a></li>
                    <li><a href="noticias.html">Noticias</a></li>
                    <li><a href="actividades.html">Actividades</a></li>
                    <li><a href="apunt_donacion.html">Apuntate/Donaciones</a></li>
                    <li><div class="dropdown">
                        <a onclick="myFunction()" class="dropbtn">Login miembros</a>
                        <div id="myDropdown" class="dropdown-content">
                            <form name="login" action="admin/area-usuario.html" method="POST">
                            <input type="text" class="input-login" name="usuario"  maxlength="50">
                            <input type="password" class="input-login" name="contrasena" maxlength="50">
                            <input class="sub2" type="submit" value="Login"  name="enviar" />
                            </form>
                        </div>
                        </div>
                    </li>
                </ul>
            </nav>
        </header>
        <%@page import="pac.Noticias" %>
        <%@page import="pac.Actividades" %>
        <%
            String[] titN = new String[4];
            String[] imgN = new String[4];
            String[] urlN = new String[4];
            Noticias n;
            n=new Noticias();
            titN = n.getTitN4();
            imgN = n.getImgN4();
            urlN = n.getUrlN4();
        %>
        <%
            String[] titA = new String[4];
            String[] imgA = new String[4];
            String[] urlA = new String[4];
            Actividades a;
            a=new Actividades();
            titA = a.getTitA4();
            imgA = a.getImgA4();
            urlA = a.getUrlA4();
        %>
        <section class="content" id="content">
            <div class="clearflx">&nbsp;</div>
            <div id="ImgPrincipal"><img src="Imagenes/img1.jpg" alt="Imagen"></div>
            <div id="lineanoticias"><h2>Noticias</h2></div>
            <div class="contenedor" id="cont1">
                <a href=<%=urlN[0]%> ><div class="cuadro">
                    <img src=<%=imgN[0]%>>
                    <div class="footcuadro"><h4><%=titN[0]%></h4></div>
                </div></a>
                <a href=<%=urlN[1]%> ><div class="cuadro">
                    <img src=<%=imgN[1]%>>
                    <div class="footcuadro"><h4><%=titN[1]%></h4></div>
                </div></a>
                <a href=<%=urlN[2]%> ><div class="cuadro">
                    <img src=<%=imgN[2]%>>
                    <div class="footcuadro"><h4><%=titN[2]%></h4></div>
                </div></a>
                <a href=<%=urlN[3]%> ><div class="cuadro">
                    <img src=<%=imgN[3]%>>
                    <div class="footcuadro"><h4><%=titN[3]%></h4></div>
                </div></a>
            </div>
            <div id="lineaactividades"><h2>Actividades</h2></div>
            <div class="contenedor" id="cont2">
                 <a href=<%=urlA[0]%> ><div class="cuadro">
                    <img src=<%=imgA[0]%>>
                    <div class="footcuadro"><h4><%=titA[0]%></h4></div>
                </div></a>
                <a href=<%=urlA[1]%> ><div class="cuadro">
                    <img src=<%=imgA[1]%>>
                    <div class="footcuadro"><h4><%=titA[1]%></h4></div>
                </div></a>
                <a href=<%=urlA[2]%> ><div class="cuadro">
                    <img src=<%=imgA[2]%>>
                    <div class="footcuadro"><h4><%=titA[2]%></h4></div>
                </div></a>
                <a href=<%=urlA[3]%> ><div class="cuadro">
                    <img src=<%=imgA[3]%>>
                    <div class="footcuadro"><h4><%=titA[3]%></h4></div>
                </div></a>
            </div>
            <div class="clearflx">&nbsp</div>
        </section>
        <footer>Pie de pagina</footer>
    </body>
</html>
