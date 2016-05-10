<%-- 
    Document   : actividad
    Created on : 10-may-2016, 19:06:01
    Author     : Vicente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="../style.css" type="text/css"/>
        <link rel="stylesheet" href="../pruebacss.css" type="text/css"/>

        <title>Actividad contra el transporte de animales para experimentacion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="../js/desplegable.js"></script>
        

    </head>
    <body >
    
        <header >
            <img src="../Imagenes/logo.png" alt="Logo">
            <nav>
                <ul>
                    <li><a href="../index.html">Inicio</a></li>
                    <li><a href="../sobre_nosotros.html">Sobre nosotros</a></li>
                    <li><a href="../noticias.html" >Noticias</a></li>
                    <li><a href="../actividades.html" style="background-color: white">Actividades</a></li>
                    <li><a href="../apunt_donacion.html">Apuntate/Donaciones</a></li>
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
        <%@page import="pac.Actividades" %>
        <%
            
            String[] titA = new String[4];
            String[] urlA = new String[4];
            String title = new String();
            String image = new String();
            String place = new String();
            String date = new String();
            String texto = new String();
            Actividades a;
            a=new Actividades();
            title = a.getTitle();
            image = a.getImage();
            place = a.getPlace();
            date = a.getDate();
            texto = a.getTexto();
            titA = a.getTitA4();
            urlA = a.getUrlA4();
        %>
        <section class="content" id="content4">
            <div class="contenido">
                <span class="titulo"><%=title%></span>
                <br>
                
                <p>
                    <img src="../<%=image%>" alt=""  class="imagen-noticia">
                <h3> <%=date%></h3>
                <h3> <%=place%></h3>
                <%=texto%>
                    
                    <h4>Apúntate</h4>
                    <form name="apuntarse" action="#" method="POST" >
                        
                            
                        <input type="submit" name="enviar" value="Me apunto">
                    </form>

                    
                
                
            </div>
            <div class="block_bloque block" >
                <div class="header_block block">
                    <h3>Próximas actividades</h3>
                </div>
                
                <a href="../<%=urlA[0]%>"><%=titA[0]%></a><br><br>
                <a href="../<%=urlA[1]%>"><%=titA[0]%></a><br><br>
                <a href="../<%=urlA[2]%>"><%=titA[0]%></a><br><br>
                <a href="../<%=urlA[3]%>"><%=titA[0]%></a><br><br>
            </div>
        </section>
        <footer>Pie de pagina</footer>
    </body>
</html>


