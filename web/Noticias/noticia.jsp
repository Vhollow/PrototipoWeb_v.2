<%-- 
    Document   : noticia
    Created on : 10-may-2016, 19:27:56
    Author     : Vicente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <%@page import="pac.Noticias" %>
        <%
            
            String[] titN = new String[4];
            String[] urlN = new String[4];
            String title = new String();
            String image = new String();
            String texto = new String();
            Noticias n;
            n=new Noticias();
            title = n.getTitle();
            image = n.getImage();
            texto = n.getTexto();
            titN = n.getTitN4();
            urlN = n.getUrlN4();
        %>
    <head>
        <link rel="stylesheet" href="../style.css" type="text/css"/>
        <link rel="stylesheet" href="../pruebacss.css" type="text/css"/>

        <title><%=title%></title>
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
                    <li><a href="../noticias.html" style="background-color: white">Noticias</a></li>
                    <li><a href="../actividades.html">Actividades</a></li>
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
        <section class="content" id="content4">
            <div class="contenido">
                <span class="titulo"><%=title%></span>
                <br>
                
                <img src="../<%=image%>"  class="imagen-noticia">
                <%=texto%>
                    
                    <h4>Realiza un comentario</h4>
                    <form name="comentario" action="#" method="POST" >
                        
                            
                        <label class="label">Nombre<span class="asterisco">*</span></label>
                        <input type="text" name="nombre"  maxlength="50"><br>
                        <textarea name="comentario" rows="5" cols="100">Introduce un comentario</textarea><br>
                        <input type="submit" name="enviar" value="Enviar comentario">
                    </form>

                    
                
                
            </div>
            <div class="block_bloque block" >
                <div class="header_block block">
                    <h3>Últimas Noticias</h3>
                </div>
                
                <a href="../<%=urlN[0]%>"><%=titN[0]%></a><br><br>
                <a href="../<%=urlN[1]%>"><%=titN[1]%></a><br><br>
                <a href="../<%=urlN[2]%>"><%=titN[2]%></a><br><br>
                <a href="../<%=urlN[3]%>"><%=titN[3]%></a><br><br>
            </div>
            <div class="clearflx"></div>
            
        </section>
        <footer>Pie de pagina</footer>
    </body>
</html>
