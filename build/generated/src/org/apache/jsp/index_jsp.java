package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/general.jsp");
    _jspx_dependants.add("/general1.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>fee management</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write(".m1\n");
      out.write("{\n");
      out.write("    background-image: url(college/photos/istockphoto-1182211320-612x612.jpg);\n");
      out.write("    height: 600px;\n");
      out.write("    width: 100%;\n");
      out.write("    background-size: 100% 100%;\n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 60px;\n");
      out.write("    font-family:  serif;\n");
      out.write("    padding-top: 24px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".k\n");
      out.write("{\n");
      out.write("   \n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-family:  serif;\n");
      out.write("    color: #0f5132;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".k:hover{\n");
      out.write("   color: #000;\n");
      out.write("}\n");
      out.write(".L{\n");
      out.write("    padding-top: 15px;\n");
      out.write("     background-image: url(college/photos/abc.jpg);\n");
      out.write("        background-size: 100% 100%;\n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 22px;\n");
      out.write("    font-family:  serif;\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".d1\n");
      out.write("{\n");
      out.write("\tbackground-image:url(college/photos/black-1072366_640.webp);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"styles/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"styles/js/bootstrap.bundle.js\" type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("<script src=\"styles/js/jquery.js\"></script>\n");
      out.write("    <script>\n");
      out.write("\t\t\t$(document).ready(function(e) {\n");
      out.write("                                    $(\".L\").hide();\n");
      out.write("\n");
      out.write("\t\t\t\t\t$(\".K\").click(function(){\n");
      out.write("\t\t\t\t\t\t$(\".L\").slideToggle(2000);\n");
      out.write("\t\t\t\t});\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark d1\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" style=\"font-size:28px; font-family: serif;\" href=\"#\">Fee Management</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\n");
      out.write("      <ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px;\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\"  style=\"font-size:20px; font-family: serif;\" href=\"index.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"login.jsp\"  style=\"font-size:20px; font-family: serif;\"  aria-current=\"page\">Signin</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\">\n");
      out.write("        <input class=\"form-control me-3\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("    <div class=\"m1\">FEES MANAGEMENT SYSTEM\n");
      out.write("<div class=\"K\">ABOUT US\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"L\" >\n");
      out.write("                        WElCOME TO FEE MANAGEMENT SITE:<br>\n");
      out.write("                        <img src=\"college/photos/Screenshot__38_-removebg-preview.png\" style=\"height: 100px;\"><br>\n");
      out.write("           REGISTER YOUR SELF AND THEN PAY YOUR COLLEGE FEES.\n");
      out.write("           </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("<div class=\"fotter\">\n");
      out.write("    <font face=\"serif\" size=\"6\" class=\"w1\">\n");
      out.write("                All copyrights&copy; are reserved by me.\n");
      out.write("                </font>\n");
      out.write("                </div><!--fotter end-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("    .fotter{\n");
      out.write("        background-image: url(college/photos/black-1072366_640.webp);\n");
      out.write("        height:140px;\n");
      out.write("\twidth:100%;\n");
      out.write("\tfloat:left;\n");
      out.write("\tline-height:140px;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tfont-size:25px;\n");
      out.write("    }\n");
      out.write("    .w1\n");
      out.write("    {\n");
      out.write("        color: #ffffff;\n");
      out.write("    }\n");
      out.write("    </style>");
      out.write('\r');
      out.write('\n');
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
