<%-- 
    Document   : noticias
    Created on : 10-may-2016, 17:58:22
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
        <script src="js/desplegable.js"></script>
    </head>
    <body onload="alternar_banner()">
    
        <header >
            <img src="Imagenes/logo.png" alt="Logo">
            <nav>
                <ul>
                    <li><a href="index.html">Inicio</a></li>
                    <li><a href="sobre_nosotros.html">Sobre nosotros</a></li>
                    <li><a href="" style="background-color: white">Noticias</a></li>
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
        <%
            String[] titN = new String[4];
            String[] imgN = new String[4];
            String[] urlN = new String[4];
            String[] texN = new String[4];
            Noticias n;
            n=new Noticias();
            titN = n.getTitN4();
            imgN = n.getImgN4();
            urlN = n.getUrlN4();
            texN = n.getTexN4();
        %>
        <script>
            var array_imagen;
            array_imagen = new Array(4) ;
            array_imagen[0] = new Image(120,41) ;
            array_imagen[0].src ="<%=imgN[0]%>" ;
            array_imagen[1] = new Image(120,41) ;
            array_imagen[1].src = "<%=imgN[0]%>" ;
            array_imagen[2] = new Image(120,41) ;
            array_imagen[2].src = "<%=imgN[0]%>" ; 
            array_imagen[3] = new Image(120,41) ;
            array_imagen[3].src = "<%=imgN[0]%>";
            
            var array_url;
            array_url = new Array(4) ;
            array_url[0] = "<%=urlN[0]%>";
            array_url[1] = "<%=urlN[1]%>" ;
            array_url[2]= "<%=urlN[2]%>"; 
            array_url[3]= "<%=urlN[3]%>";

            var array_tit;
            array_tit = new Array(4) ;
            array_tit[0] = "<%=titN[0]%>";
            array_tit[1] = "<%=titN[1]%>" ;
            array_tit[2]= "<%=titN[2]%>"; 
            array_tit[3]= "<%=titN[3]%>";

            var array_tex;
            array_tex = new Array(4) ;
            array_tex[0] = "<%=texN[0]%>";
            array_tex[1] = "<%=texN[1]%>" ;
            array_tex[2]= "<%=texN[2]%>"; 
            array_tex[3]= "<%=texN[3]%>";
            //variable para llevar la cuenta de la imagen siguiente 
            contador = 0 ;
            var time;
            //función para rotar el banner 
            function alternar_banner(){ 
                document.getElementById("centro").src = array_imagen[contador].src ;
                document.getElementById("link").href = array_url[contador];
                document.getElementById("titulo").textContent = array_tit[contador];
                document.getElementById("texto").textContent = array_tex[contador];
                contador ++ ;
                if(contador>3){contador=0;} 
                time=setTimeout("alternar_banner()",10000) ;
            }
            //funcion para cambiar a la imagen anterior
            function izquierda(){
                contador-=2;
                if(contador===-1) contador=3;
                if(contador===-2) contador=2;
                document.getElementById("centro").src = array_imagen[contador].src ;
                document.getElementById("link").href = array_url[contador];
                document.getElementById("titulo").textContent = array_tit[contador];
                document.getElementById("texto").textContent = array_tex[contador];
                contador++;
                clearTimeout(time);
                time=setTimeout("alternar_banner()",10000) ;
            }
            //funcion para cambiar a la imagen siguiente
            function derecha(){
                if(contador>3) contador=0;
                document.getElementById("centro").src = array_imagen[contador].src ;
                document.getElementById("link").href = array_url[contador];
                document.getElementById("titulo").textContent= array_tit[contador];
                document.getElementById("texto").textContent = array_tex[contador];
                contador++;
                clearTimeout(time);
                time=setTimeout("alternar_banner()",10000) ;
            }
            //cambia la flecha izquierda al pulsar
            function ci(){
                document.getElementById("Izq").src="Imagenes/i2.png";
            }
            //vuelve a cambiarla al levantar
            function ci2(){
                document.getElementById("Izq").src="Imagenes/i1.png";
            }
            //cambia la flecha derecha al pulsar
            function cd(){
                document.getElementById("Der").src="Imagenes/d2.png";
            }
            //vuelve a cambiarla al levantar
            function cd2(){
                document.getElementById("Der").src="Imagenes/d1.png";
            }
        </script>
        <section class="content" id="content2">
            <div id="lineaPrincipal"><h2>Noticia destacada</h2></div>
            <div class="NotPrincipal">
                <div id="ImgNotPrincipal"> 
                    <img src="Imagenes/i1.png" id="Izq" alt="Flecha" onclick="izquierda()" onmousedown="ci()" onmouseup="ci2()">
                    <img src="Imagenes/d1.png" id="Der" alt="Flecha" onclick="derecha()" onmousedown="cd()" onmouseup="cd2()">
                    <a href="#" id="link" style="height: inherit"><img src="#"  alt="Imagen" id="centro"></a>
                </div>
                <div id="TexPrincipal">
                    <h3 id="titulo"></h3>
                    <p id="texto"></p>
                </div>
            </div>
            <div id="lineanoticias"><h2>Noticias</h2></div>
            <div class="contenedor" id="cont3">
                <a href=<%=urlN[0]%> ><div class="cuadro2">
                    <img src=<%=imgN[0]%>>
                    <div class="footcuadro"><h4><%=titN[0]%></h4></div>
                </div></a>
                <a href=<%=urlN[1]%> ><div class="cuadro2">
                    <img src=<%=imgN[1]%>>
                    <div class="footcuadro"><h4><%=titN[1]%></h4></div>
                </div></a>
                <a href=<%=urlN[2]%> ><div class="cuadro2">
                    <img src=<%=imgN[2]%>>
                    <div class="footcuadro"><h4><%=titN[2]%></h4></div>
                </div></a>
                <a href=<%=urlN[3]%> ><div class="cuadro2">
                    <img src=<%=imgN[3]%>>
                    <div class="footcuadro"><h4><%=titN[3]%></h4></div>
                </div></a>
            </div>
        </section>
        <footer>Pie de pagina</footer>
    </body>
</html>

