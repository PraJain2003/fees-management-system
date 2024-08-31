package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/general2.jsp");
    _jspx_dependants.add("/general3.jsp");
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

      out.write('\n');
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>fee management</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".d1\n");
      out.write("{\n");
      out.write("\tbackground-image:url(college/photos/black-1072366_640.webp);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"styles/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"styles/js/bootstrap.bundle.js\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark d1\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" style=\"font-size:25px; font-family:Arial, Helvetica, sans-serif;\" href=\"#\">Fee Management</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\n");
      out.write("      <ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px;\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"admin/college.jsp\">College</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"login.jsp\"  aria-current=\"page\">Signin</a>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"x1\">login to fee</div>\n");
      out.write("        <div class=\"middle\">\n");
      out.write("                <form>\n");
      out.write("                <div class=\"Register\">\n");
      out.write("                    \t<div class=\"head\">Register</div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        \t<div class=\"s1\">Email:</div>\n");
      out.write("                            <div class=\"s2\"><input type=\"email\" placeholder=\"Enter email\" class=\"fld\"></div>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                        \t<div class=\"s1\">Password:</div>\n");
      out.write("                            <div class=\"s2\"><input type=\"password\" placeholder=\"Enter password\" class=\"fld\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row2\">\n");
      out.write("                        \t<button type=\"submit\" class=\"slash\">Register</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("             \n");
      out.write("                </div><!--middle end-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<div class=\"fotter\">\n");
      out.write("    <font face=\"Arial Black, Gadget, sans-serif\" size=\"5\" class=\"w1\">\n");
      out.write("                All copyrights&copy; are reserved by me.\n");
      out.write("                </font>\n");
      out.write("                </div><!--fotter end-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("    .fotter{\n");
      out.write("        background-image: url(college/photos/black-1072366_640.webp);\n");
      out.write("        height:140px;\n");
      out.write("\twidth:1368px;\n");
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
