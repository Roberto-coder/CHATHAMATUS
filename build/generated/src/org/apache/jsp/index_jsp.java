package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chat</title>\n");
      out.write("        \n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("       \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"row navbar-fixed-bottom\">\n");
      out.write("            <div class=\"col-md-4 chat-box footer pull-right\">\n");
      out.write("                <div class=\"panel panel-primary\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        \n");
      out.write("                        <span class=\"glyphicon glyphicon-comment\"></span> Chat\n");
      out.write("                        <div class=\"btn-group pull-right\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default btn-xs dropdown toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-down\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu slidedown\">\n");
      out.write("                                <li><a href=\"\"><span class=\"glyphicon glyphicon-off\"></span>Salir</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"panel-body chat-widget\">\n");
      out.write("                        <ul class=\"chat chat-messages\">\n");
      out.write("                            \n");
      out.write("                            <li class=\"left clearfix\">\n");
      out.write("                                <span class=\"chat-img pull-left\">\n");
      out.write("                                    <img src=\"\" />\n");
      out.write("                                </span>\n");
      out.write("                                <div class=\"chat-body clear-fix\">\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <strong class=\"primary-font\">Pedro</strong>\n");
      out.write("                                        <small class=\"pull-right text-muted\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-time\"></span>\n");
      out.write("                                            A las 12:54\n");
      out.write("                                        </small>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p>\n");
      out.write("                                        sadasd asdasdas asdadasdasd asdasdasdasd asdasdasda dasdasddasda\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>                            \n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"panel-footer\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control input-sm chat-name\" placeholder=\"Escriba su nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control input-sm chat-entry\" placeholder=\"Escriba un mensaje y presione enter para enviar\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
