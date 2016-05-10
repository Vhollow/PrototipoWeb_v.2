package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pac.Noticias;
import pac.Actividades;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
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
      out.write("    <body>\n");
      out.write("        <header >\n");
      out.write("            <img src=\"Imagenes/logo.png\" alt=\"Logo\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\" style=\"background-color: white\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"sobre_nosotros.html\">Sobre nosotros</a></li>\n");
      out.write("                    <li><a href=\"noticias.html\">Noticias</a></li>\n");
      out.write("                    <li><a href=\"actividades.html\">Actividades</a></li>\n");
      out.write("                    <li><a href=\"apunt_donacion.html\">Apuntate/Donaciones</a></li>\n");
      out.write("                    <li><div class=\"dropdown\">\n");
      out.write("                        <a onclick=\"myFunction()\" class=\"dropbtn\">Login miembros</a>\n");
      out.write("                        <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("                            <form name=\"login\" action=\"admin/area-usuario.html\" method=\"POST\">\n");
      out.write("                            <input type=\"text\" class=\"input-login\" name=\"usuario\"  maxlength=\"50\">\n");
      out.write("                            <input type=\"password\" class=\"input-login\" name=\"contrasena\" maxlength=\"50\">\n");
      out.write("                            <input class=\"sub2\" type=\"submit\" value=\"Login\"  name=\"enviar\" />\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
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
      out.write("        ");

            String[] titA = new String[4];
            String[] imgA = new String[4];
            String[] urlA = new String[4];
            Actividades a;
            a=new Actividades();
            titA = a.getTitA4();
            imgA = a.getImgA4();
            urlA = a.getUrlA4();
        
      out.write("\n");
      out.write("        <section class=\"content\" id=\"content\">\n");
      out.write("            <div class=\"clearflx\">&nbsp;</div>\n");
      out.write("            <div id=\"ImgPrincipal\"><img src=\"Imagenes/img1.jpg\" alt=\"Imagen\"></div>\n");
      out.write("            <div id=\"lineanoticias\"><h2>Noticias</h2></div>\n");
      out.write("            <div class=\"contenedor\" id=\"cont1\">\n");
      out.write("                <a href=");
      out.print(urlN[0]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgN[0]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[0]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlN[1]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgN[1]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[1]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlN[2]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgN[2]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[2]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlN[3]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgN[3]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titN[3]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"lineaactividades\"><h2>Actividades</h2></div>\n");
      out.write("            <div class=\"contenedor\" id=\"cont2\">\n");
      out.write("                 <a href=");
      out.print(urlA[0]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgA[0]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titA[0]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlA[1]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgA[1]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titA[1]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlA[2]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgA[2]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titA[2]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("                <a href=");
      out.print(urlA[3]);
      out.write(" ><div class=\"cuadro\">\n");
      out.write("                    <img src=");
      out.print(imgA[3]);
      out.write(">\n");
      out.write("                    <div class=\"footcuadro\"><h4>");
      out.print(titA[3]);
      out.write("</h4></div>\n");
      out.write("                </div></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearflx\">&nbsp</div>\n");
      out.write("        </section>\n");
      out.write("        <footer>Pie de pagina</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
