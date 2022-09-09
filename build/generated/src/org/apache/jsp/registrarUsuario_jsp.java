package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.RolDAO;
import ModeloVO.RolVO;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
<<<<<<< HEAD
      out.write("<head>\r\n");
      out.write("\t <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Usuario</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"Estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/CheckPassword.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/CheckPassword.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("<section class=\"vh-100\" style=\"background-color: #eee;\">\r\n");
=======
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Usuario</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"Estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/CheckPassword.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/CheckPassword.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"vh-100\" style=\"background-color: #eee;\">\r\n");
>>>>>>> 0ccebee79b70dff729ca8be80fd7dfec14122f8f
      out.write("  <div class=\"container h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col-lg-12 col-xl-11\">\r\n");
      out.write("        <div class=\"card text-black\" style=\"border-radius: 25px;\">\r\n");
      out.write("          <div class=\"card-body p-md-5\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1\">\r\n");
      out.write("\r\n");
<<<<<<< HEAD
      out.write("                <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">Registrarse </p>\r\n");
      out.write("\r\n");
      out.write("                <form class=\"mx-1 mx-md-4\"method=\"post\" action=\"Usuario\" >\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("                        <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example3c\">Correo</label>\r\n");
      out.write("                      <input type=\"email\"  class=\"formulario__input\" name=\"textUsuario\" id=\"mail\" />\r\n");
      out.write("                      \r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("                        <i class=\"fas fa-lock fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example4c\">Contraseña</label>\r\n");
      out.write("                      <input type=\"password\"  class=\"formulario__input password1\"name=\"textClave\" id=\"txtPassword\" />\r\n");
      out.write("                       <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\r\n");
      out.write("                      <div id=\"strengthMessage\"></div>\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                     \r\n");
      out.write("                                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                     \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                       \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                      <!-- Grupo: Estado oculto -->\r\n");
      out.write("                         <input type=\"hidden\" readonly read value=\"Activo\" name=\"textEstado\"><br><br>\r\n");
      out.write("                         \r\n");
      out.write("\r\n");
      out.write("<input class=\"form-check-input me-2\" type=\"checkbox\" value=\"\" id=\"form2Example3c\" />\r\n");
      out.write("                    <label class=\"form-check-label\" for=\"form2Example3\">\r\n");
      out.write("                  <div class=\"form-check d-flex justify-content-center mb-5\">\r\n");
      out.write("                    \r\n");
      out.write("                      I agree all statements in <a href=\"#!\">Terms of service</a>\r\n");
      out.write("                    \r\n");
      out.write("                  </div></label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n");
      out.write("                      <input type=\"hidden\" value=\"1\" name=\"opcion\" >\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg\">Registrar</button>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2\">\r\n");
      out.write("\r\n");
      out.write("                  <img src=\"IMG/Logo.png\"\r\n");
      out.write("                  class=\"img-fluid\" alt=\"Logo\">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write(" <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("                     <script>\r\n");
      out.write("  window.addEventListener(\"load\", function() {\r\n");
      out.write(" \r\n");
      out.write("    // icono para poder interaccionar con el elemento\r\n");
      out.write("    showPassword = document.querySelector('.show-password');\r\n");
      out.write("    showPassword.addEventListener('click', () => {\r\n");
      out.write(" \r\n");
      out.write("      // elementos input de tipo password\r\n");
      out.write("      password1 = document.querySelector('.password1');\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("      if ( password1.type === \"text\" ) {\r\n");
      out.write("        password1.type = \"password\"\r\n");
      out.write("        \r\n");
      out.write("        showPassword.classList.remove('fa-eye-slash');\r\n");
      out.write("      } else {\r\n");
      out.write("        password1.type = \"text\"\r\n");
      out.write("       \r\n");
      out.write("        showPassword.classList.toggle(\"fa-eye-slash\");\r\n");
      out.write("      }\r\n");
      out.write("  })\r\n");
      out.write("});\r\n");
      out.write("</script> \r\n");
      out.write(" <div class=\"tres\"> \r\n");
      out.write("                         \r\n");
      out.write("                                         ");
 
                                         if(request.getAttribute("MensajeError") !=null) {
      out.write("\r\n");
      out.write("                                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \r\n");
      out.write("               \r\n");
      out.write("                                         ");
}else {
      out.write("\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("     </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    ");
=======
      out.write("                <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">Sign up</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <form class=\"mx-1 mx-md-4\" id=\"formulario\" name=\"fmrUsuarios\" method=\"post\" action=\"Usuario\" onSubmit=\"return validarfor(); checkForm(this); return false;\"   >\r\n");
      out.write("\r\n");
      out.write("                <!-- Grupo: Correo Electronico -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("                      <input type=\"email\" id=\"form3Example3c\" class=\"form-control\" />\r\n");
      out.write("                      <label class=\"form-label\" for=\"form3Example3c\" for=\"correo\">Your Email</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("                     <input type=\"email\" id=\"form3Example3c\" class=\"form-control\" />\r\n");
      out.write("                     <label class=\"form-label\" for=\"form3Example3c\">Your Email</label>\r\n");
      out.write("                    <label for=\"correo\" class=\"formulario__label\">Usuario</label>\r\n");
      out.write("                    <div class=\"formulario__grupo-input\">\r\n");
      out.write("                        <input type=\"email\" class=\"formulario__input\" name=\"textUsuario\" id=\"mail\" placeholder=\"correo@correo.com\">\r\n");
      out.write("                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Grupo: Contraseña -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"formulario__grupo\" id=\"grupo__password\" Onkeypress=\"enterEnviar(event);\">\r\n");
      out.write("                    <label for=\"password\" class=\"formulario__label\">Contraseña</label>\r\n");
      out.write("                    <div class=\"formulario__grupo-input\">\r\n");
      out.write("                        <input type=\"password\" class=\"formulario__input password1\"  name=\"textClave\" id=\"txtPassword\" placeholder=\"\"/>\r\n");
      out.write("\r\n");
      out.write("                        <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\r\n");
      out.write("                        <div id=\"strengthMessage\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <script>\r\n");
      out.write("                    window.addEventListener(\"load\", function () {\r\n");
      out.write("\r\n");
      out.write("// icono para poder interaccionar con el elemento\r\n");
      out.write("                        showPassword = document.querySelector('.show-password');\r\n");
      out.write("                        showPassword.addEventListener('click', () => {\r\n");
      out.write("\r\n");
      out.write("// elementos input de tipo password\r\n");
      out.write("                            password1 = document.querySelector('.password1');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            if (password1.type === \"text\") {\r\n");
      out.write("                                password1.type = \"password\"\r\n");
      out.write("\r\n");
      out.write("                                showPassword.classList.remove('fa-eye-slash');\r\n");
      out.write("                            } else {\r\n");
      out.write("                                password1.type = \"text\"\r\n");
      out.write("\r\n");
      out.write("                                showPassword.classList.toggle(\"fa-eye-slash\");\r\n");
      out.write("                            }\r\n");
      out.write("                        })\r\n");
      out.write("                    });\r\n");
      out.write("                </script> \r\n");
      out.write("                <script>\r\n");
      out.write("                    function checkPassword(valor) {\r\n");
      out.write("                        var myregex = /^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/;\r\n");
      out.write("                        if (myregex.test(valor)) {\r\n");
      out.write("                            alert(valor + \" es valido :-) !\");\r\n");
      out.write("                            return true;\r\n");
      out.write("                        } else {\r\n");
      out.write("                            alert(valor + \" NO es valido!\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    function checkForm(form) {\r\n");
      out.write("                        if (form.textClave.length == 0) {\r\n");
      out.write("                            if (!checkPassword(form.textClave.value)) {\r\n");
      out.write("                                alert(\"La contraseña no es valida!\");\r\n");
      out.write("                                form.textClave.focus();\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        return true;\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("                </script>\r\n");
      out.write("                <!-- Grupo: Estado oculto -->\r\n");
      out.write("                <input type=\"hidden\" readonly read value=\"Activo\" name=\"textEstado\"><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Grupo: Terminos y Condiciones -->\r\n");
      out.write("                <div class=\"formulario__grupo\" id=\"grupo__terminos\">\r\n");
      out.write("                    <label class=\"formulario__label\">\r\n");
      out.write("                        <input class=\"formulario__checkbox\" type=\"checkbox\" name=\"terminos\" id=\"terminos\">\r\n");
      out.write("                        Acepto los Terminos y Condiciones\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"formulario__mensaje\" id=\"formulario__mensaje\">\r\n");
      out.write("                    <p><i class=\"fas fa-exclamation-triangle\"></i> <b>Error:</b> Por favor rellena el formulario correctamente. </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"formulario__grupo formulario__grupo-btn-enviar\">\r\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcion\" class=\"btn float-right login_btn\">\r\n");
      out.write("                    <button type=\"submit\" class=\"formulario__btn\"onclick=\"validarContraseña()\" >Registrar</button>\r\n");
      out.write("                    <p class=\"formulario__mensaje-exito\" id=\"formulario__mensaje-exito\">Formulario enviado exitosamente!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("        </main>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"tres\"> \r\n");
      out.write("\r\n");
      out.write("    ");

                                             if (request.getAttribute("MensajeError") != null) {
      out.write("\r\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \r\n");
      out.write("\r\n");
      out.write("    ");
} else {
      out.write("\r\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("                        function validarfor() {\r\n");
      out.write("\r\n");
      out.write("                            var correo = document.getElementById(\"mail\").value;\r\n");
      out.write("\r\n");
      out.write("                            var expr = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\r\n");
      out.write("\r\n");
      out.write("                            if (!expr.test(correo)) {                                                            //COMPRUEBA MAIL\r\n");
      out.write("                                alert(\"Error: La dirección de correo \" + correo + \" es incorrecta.\");\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        function validar() {\r\n");
      out.write("                            //obteniendo el valor que se puso en campo text del formulario\r\n");
      out.write("                            correo = document.getElementById(\"mail\").value;\r\n");
      out.write("\r\n");
      out.write("                            //la condición\r\n");
      out.write("                            if (correo.length == 0) {\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            if (correo.length == 0 || /^\\s+$/.test(correo)) {\r\n");
      out.write("                                alert('El Correo esta vacio!');\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            return true;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("</script>                            \r\n");
      out.write("</body>\r\n");
      out.write("</center>\r\n");
      out.write("</html>");
>>>>>>> 0ccebee79b70dff729ca8be80fd7dfec14122f8f
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
