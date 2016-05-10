package org.apache.jsp.Noticias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pac.Noticias;

public final class noticia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("        ");

            
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
        
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../style.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../pruebacss.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>");
      out.print(title);
      out.write("</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"../js/desplegable.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("    \n");
      out.write("        <header >\n");
      out.write("            <img src=\"../Imagenes/logo.png\" alt=\"Logo\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../index.html\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"../sobre_nosotros.html\">Sobre nosotros</a></li>\n");
      out.write("                    <li><a href=\"../noticias.html\" style=\"background-color: white\">Noticias</a></li>\n");
      out.write("                    <li><a href=\"../actividades.html\">Actividades</a></li>\n");
      out.write("                    <li><a href=\"../apunt_donacion.html\">Apuntate/Donaciones</a></li>\n");
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
      out.write("        <section class=\"content\" id=\"content4\">\n");
      out.write("            <div class=\"contenido\">\n");
      out.write("                <span class=\"titulo\">");
      out.print(title);
      out.write("</span>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <img src=\"../");
      out.print(image);
      out.write("\"  class=\"imagen-noticia\">\n");
      out.write("                ");
      out.print(texto);
      out.write("\n");
      out.write("                    \n");
      out.write("                    <h4>Realiza un comentario</h4>\n");
      out.write("                    <form name=\"comentario\" action=\"#\" method=\"POST\" >\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                        <label class=\"label\">Nombre<span class=\"asterisco\">*</span></label>\n");
      out.write("                        <input type=\"text\" name=\"nombre\"  maxlength=\"50\"><br>\n");
      out.write("                        <textarea name=\"comentario\" rows=\"5\" cols=\"100\">Introduce un comentario</textarea><br>\n");
      out.write("                        <input type=\"submit\" name=\"enviar\" value=\"Enviar comentario\">\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"block_bloque block\" >\n");
      out.write("                <div class=\"header_block block\">\n");
      out.write("                    <h3>Últimas Noticias</h3>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <a href=\"../");
      out.print(urlN[0]);
      out.write('"');
      out.write('>');
      out.print(titN[0]);
      out.write("</a><br><br>\n");
      out.write("                <a href=\"../");
      out.print(urlN[1]);
      out.write('"');
      out.write('>');
      out.print(titN[1]);
      out.write("</a><br><br>\n");
      out.write("                <a href=\"../");
      out.print(urlN[2]);
      out.write('"');
      out.write('>');
      out.print(titN[2]);
      out.write("</a><br><br>\n");
      out.write("                <a href=\"../");
      out.print(urlN[3]);
      out.write('"');
      out.write('>');
      out.print(titN[3]);
      out.write("</a><br><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearflx\"></div>\n");
      out.write("            \n");
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
