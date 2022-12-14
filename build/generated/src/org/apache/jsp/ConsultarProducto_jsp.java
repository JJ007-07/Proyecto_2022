package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Util.ConexionDB;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;
import ModeloVO.ProductoVO;
import ModeloDAO.ProductoDAO;
import java.sql.*;
import ModeloVO.UsuarioVO;

public final class ConsultarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"Estilos/Estilos3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/nav.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/boton.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    ");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache, no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
       
        
        
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     ");
 
     HttpSession sesion =(HttpSession)request.getSession();
     String Usuario="";
    if (sesion.getAttribute("datosUsuario")==null) {
         request.getRequestDispatcher("Login.jsp").forward(request, response);
            
        }else{
        
        UsuarioVO usuVO= (UsuarioVO)sesion.getAttribute("datosUsuario");
        Usuario = usuVO.getNombreUsuario();
        
    
    
    }
        
        
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"card-header\">\r\n");
      out.write("            \r\n");
      out.write("        <h1>Bienvenido: ");
      out.print(Usuario);
      out.write("</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("        </div><br><br>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("   \r\n");

    Connection con;
    String url = "jdbc:mysql://localhost:3306/tatis_media_y_todo";
    String Driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String clave = "";
    Class.forName(Driver);
    con = DriverManager.getConnection(url, user, clave);
    Statement smt;
    ResultSet rs;
    smt = con.createStatement();
    rs = smt.executeQuery("select * from producto");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Consultar Producto</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #8fc4b7;\">\r\n");
      out.write("        <section class=\"h-100 h-custom\">\r\n");
      out.write("            <div class=\"container py-5 h-100\">\r\n");
      out.write("                <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("                    <div class=\"col-lg-8 col-xl-6\">\r\n");
      out.write("                        <div class=\"card rounded-3\">\r\n");
      out.write("                            <img src=\"https://www.ecommercenews.pe/wp-content/uploads/2017/07/tienda-online.png\" class=\"w-100\" style=\"border-top-left-radius: .3rem; border-top-right-radius: .3rem;\" alt=\"Sample photo\">\r\n");
      out.write("                            <div class=\"card-body p-4 p-md-5\">\r\n");
      out.write("                                <h3 class=\"mb-4 pb-2 pb-md-0 mb-md-5 px-md-2\">Consultar Informaci??n De Los Productos</h3>\r\n");
      out.write("                                <form method=\"post\" action=\"Producto\">\r\n");
      out.write("                                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                                        <input max=\"100000\" type=\"text\" name=\"txtcodigoB\" class=\"form-control\" required>\r\n");
      out.write("                                        <label class=\"form-label\" for=\"form3Example1q\">Codigo De Barras Del Producto</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>   \r\n");
      out.write("                                        <div class=\"form-outline mb-4\">\r\n");
      out.write("\r\n");
      out.write("                                            <!-- Button trigger modal -->\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-secondary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
      out.write("                                                Ver Datos\r\n");
      out.write("                                            </button>\r\n");
      out.write("\r\n");
      out.write("                                            <!-- Modal -->\r\n");
      out.write("                                            <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                                                <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                                    <div class=\"modal-content\">\r\n");
      out.write("                                                        <div class=\"modal-header\">\r\n");
      out.write("                                                            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Informaci??n Disponible</h5>\r\n");
      out.write("                                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                                                <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                                            </button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-body\">\r\n");
      out.write("                                                            <div class=\"container\">               \r\n");
      out.write("                                                                <table class=\"table table-bordered\"  id=\"tablaDatos\">\r\n");
      out.write("                                                                    <thead>\r\n");
      out.write("                                                                        <tr>\r\n");
      out.write("                                                                            <th class=\"text-center\">CODIGOS DE BARRAS</th>\r\n");
      out.write("                                                                        </tr>\r\n");
      out.write("                                                                    </thead>\r\n");
      out.write("                                                                    <tbody id=\"tbodys\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                                        ");

                                                                            while (rs.next()) {
                                                                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                                        <tr>\r\n");
      out.write("                                                                            <td class=\"text-center\">");
      out.print( rs.getString("CodigoDeBarrasProducto"));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                                                                        </tr>\r\n");
      out.write("                                                                        ");
}
      out.write("\r\n");
      out.write("                                                                </table>    \r\n");
      out.write("                                                            </div>  \r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-footer\">\r\n");
      out.write("                                                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!--<a aria-current=\"page\" href=\"\" data-toggle=\"modal\" data-target=\"#editarPerfilModal\">Ver Datos Generales</a>-->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button class=\"btn btn-primary btn-lg\">Consultar</button>\r\n");
      out.write("                                        <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        ");
if (request.getAttribute("MensajeError") != null) {
      out.write("\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        ");
 } else {
      out.write("\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        ");
}
      out.write("        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
