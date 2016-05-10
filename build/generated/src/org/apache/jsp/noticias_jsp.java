package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pac.Noticias;

public final class noticias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"pruebacss.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>Asociacion para la defensa de los animales</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"js/desplegable.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"alternar_banner()\">\n");
      out.write("    \n");
      out.write("        <header >\n");
      out.write("            <img src=\"Imagenes/logo.png\" alt=\"Logo\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"sobre_nosotros.html\">Sobre nosotros</a></li>\n");
      out.write("                    <li><a href=\"\" style=\"background-color: white\">Noticias</a></li>\n");
      out.write("                    <li><a href=\"actividades.html\">Actividades</a></li>\n");
      out.write("                    <li><a href=\"apunt_donacion.html\">Apuntate/Donaciones</a></li>\n");
      out.write("                    <li><div class=\"dropdown\">\n");
      out.write("                        <a onclick=\"myFunction()\" class=\"dropbtn\">Login miembros</a>\n");
      out.write("                        <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("                            <form name=\"login\" action=\"admin/area-usuario.html\" method=\"POST\">\n");
      out.write("                            <input type=\"text\" class=\"input-login\" name=\"usuario\"  maxlength=\"50\">\n");
      out.write("                            <input type=\"password\" class=\"input-login\" name=\"contrasena\" maxlength=\"50\">\n");
      out.write("                            <input type=\"submit\" value=\"Login\"  name=\"enviar\" />\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");

            String[] titN = new String[4];
            String[] imgN = new String[4];
            String[] urlN = new String[4];
            Noticias n;
            n=new Noticias();
            titN = n.getTitN4();
            imgN = n.getImgN4();
            urlN = n.getUrlN4();
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var array_imagen;\n");
      out.write("            array_imagen = new Array(4) ;\n");
      out.write("            array_imagen[0] = new Image(120,41) ;\n");
      out.write("            array_imagen[0].src = ");
      out.print(imgN[0]);
      out.write(" ;\n");
      out.write("            array_imagen[1] = new Image(120,41) ;\n");
      out.write("            array_imagen[1].src = ");
      out.print(imgN[0]);
      out.write(" ;\n");
      out.write("            array_imagen[2] = new Image(120,41) ;\n");
      out.write("            array_imagen[2].src = ");
      out.print(imgN[0]);
      out.write(" ; \n");
      out.write("            array_imagen[3] = new Image(120,41) ;\n");
      out.write("            array_imagen[3].src = ");
      out.print(imgN[0]);
      out.write(";\n");
      out.write("            \n");
      out.write("            var array_url;\n");
      out.write("array_url = new Array(4) ;\n");
      out.write("array_url[0] = \"Noticias/noticia-basta-maltrato-granjas.html\";\n");
      out.write("array_url[1] = \"Imagenes/img2.jpg\" ;\n");
      out.write("array_url[2]= \"Imagenes/img3.png\"; \n");
      out.write("array_url[3]= \"Imagenes/img4.jpg\";\n");
      out.write("\n");
      out.write("var array_tit;\n");
      out.write("array_tit = new Array(4) ;\n");
      out.write("array_tit[0] = \"Basta de maltrato en las granjas de animales\";\n");
      out.write("array_tit[1] = \"Basta de maltrato en las granjas de animales\" ;\n");
      out.write("array_tit[2]= \"Tercer titulo\"; \n");
      out.write("array_tit[3]= \"Cuarto titulo\";\n");
      out.write("\n");
      out.write("var array_tex;\n");
      out.write("array_tex = new Array(4) ;\n");
      out.write("array_tex[0] = \"Si alguien le hiciera a un perro o a un gato lo que la ganadería industrial hace a los animales de granja, acabaría en la cárcel. La diferencia es que los animales víctimas de la ganadería industrial son cerdos, vacas, terneras, pollos y gallinas, entre  otros.  \";\n");
      out.write("array_tex[1] = \"Basta de maltrato en las granjas de animales\" ;\n");
      out.write("array_tex[2]= \"Parrafo con las primeras lineas de la noticia correspondiente\"; \n");
      out.write("array_tex[3]= \"Parrafo con las primeras lineas de la noticia correspondiente\";\n");
      out.write("//variable para llevar la cuenta de la imagen siguiente \n");
      out.write("contador = 0 ;\n");
      out.write("var time;\n");
      out.write("//función para rotar el banner \n");
      out.write("function alternar_banner(){ \n");
      out.write("   \tdocument.getElementById(\"centro\").src = array_imagen[contador].src ;\n");
      out.write("        document.getElementById(\"link\").href = array_url[contador];\n");
      out.write("        document.getElementById(\"titulo\").textContent = array_tit[contador];\n");
      out.write("        document.getElementById(\"texto\").textContent = array_tex[contador];\n");
      out.write("   \tcontador ++ ;\n");
      out.write("   \tif(contador>3){contador=0;} \n");
      out.write("   \ttime=setTimeout(\"alternar_banner()\",10000) ;\n");
      out.write("}\n");
      out.write("//funcion para cambiar a la imagen anterior\n");
      out.write("function izquierda(){\n");
      out.write("    contador-=2;\n");
      out.write("    if(contador===-1) contador=3;\n");
      out.write("    if(contador===-2) contador=2;\n");
      out.write("    document.getElementById(\"centro\").src = array_imagen[contador].src ;\n");
      out.write("    document.getElementById(\"link\").href = array_url[contador];\n");
      out.write("    document.getElementById(\"titulo\").textContent = array_tit[contador];\n");
      out.write("    document.getElementById(\"texto\").textContent = array_tex[contador];\n");
      out.write("    contador++;\n");
      out.write("    clearTimeout(time);\n");
      out.write("    time=setTimeout(\"alternar_banner()\",10000) ;\n");
      out.write("}\n");
      out.write("//funcion para cambiar a la imagen siguiente\n");
      out.write("function derecha(){\n");
      out.write("    if(contador>3) contador=0;\n");
      out.write("    document.getElementById(\"centro\").src = array_imagen[contador].src ;\n");
      out.write("    document.getElementById(\"link\").href = array_url[contador];\n");
      out.write("    document.getElementById(\"titulo\").textContent= array_tit[contador];\n");
      out.write("    document.getElementById(\"texto\").textContent = array_tex[contador];\n");
      out.write("    contador++;\n");
      out.write("    clearTimeout(time);\n");
      out.write("    time=setTimeout(\"alternar_banner()\",10000) ;\n");
      out.write("}\n");
      out.write("//cambia la flecha izquierda al pulsar\n");
      out.write("function ci(){\n");
      out.write("    document.getElementById(\"Izq\").src=\"Imagenes/i2.png\";\n");
      out.write("}\n");
      out.write("//vuelve a cambiarla al levantar\n");
      out.write("function ci2(){\n");
      out.write("    document.getElementById(\"Izq\").src=\"Imagenes/i1.png\";\n");
      out.write("}\n");
      out.write("//cambia la flecha derecha al pulsar\n");
      out.write("function cd(){\n");
      out.write("    document.getElementById(\"Der\").src=\"Imagenes/d2.png\";\n");
      out.write("}\n");
      out.write("//vuelve a cambiarla al levantar\n");
      out.write("function cd2(){\n");
      out.write("    document.getElementById(\"Der\").src=\"Imagenes/d1.png\";\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("        <section class=\"content\" id=\"content2\">\n");
      out.write("            <div id=\"lineaPrincipal\"><h2>Noticia destacada</h2></div>\n");
      out.write("            <div class=\"NotPrincipal\">\n");
      out.write("                <div id=\"ImgNotPrincipal\"> \n");
      out.write("                    <img src=\"Imagenes/i1.png\" id=\"Izq\" alt=\"Flecha\" onclick=\"izquierda()\" onmousedown=\"ci()\" onmouseup=\"ci2()\">\n");
      out.write("                    <img src=\"Imagenes/d1.png\" id=\"Der\" alt=\"Flecha\" onclick=\"derecha()\" onmousedown=\"cd()\" onmouseup=\"cd2()\">\n");
      out.write("                    <a href=\"#\" id=\"link\" style=\"height: inherit\"><img src=\"#\"  alt=\"Imagen\" id=\"centro\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"TexPrincipal\">\n");
      out.write("                    <h3 id=\"titulo\"></h3>\n");
      out.write("                    <p id=\"texto\"></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"lineanoticias\"><h2>Noticias</h2></div>\n");
      out.write("            <div class=\"contenedor\" id=\"cont3\">\n");
      out.write("                <a href=");
      out.print(urlN[0]);
      out.write(" ><div class=\"cuadro2\">\n");
      out.write("                    <img src=");
      out.print(imgN[0]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[0]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlN[1]);
      out.write(" ><div class=\"cuadro2\">\n");
      out.write("                    <img src=");
      out.print(imgN[1]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[1]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlN[2]);
      out.write(" ><div class=\"cuadro2\">\n");
      out.write("                    <img src=");
      out.print(imgN[2]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[2]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlN[3]);
      out.write(" ><div class=\"cuadro2\">\n");
      out.write("                    <img src=");
      out.print(imgN[3]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[3]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer>Pie de pagina</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
