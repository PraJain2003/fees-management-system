package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <a class=\"navbar-brand\" style=\"font-size:28px; font-family:serif;\" href=\"#\">Fee Management</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\n");
      out.write("      <ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px;\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" style=\"font-size:20px; font-family:serif;\"  href=\"index.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" style=\"font-size:20px; font-family:serif;\"  href=\"admin/college.jsp\">College</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"login.jsp\" style=\"font-size:20px; font-family:serif;\"  aria-current=\"page\">SignIn</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link active\" href=\"logout.jsp\" style=\"font-size:20px; font-family:serif;\"  aria-current=\"page\">SignOut</a>\n");
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
      out.write("\r\n");
      out.write("<script src=\"styles/js/jquery.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("    h1\r\n");
      out.write("    {\r\n");
      out.write("        padding-top: 20px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        font-family: serif;\r\n");
      out.write("    }\r\n");
      out.write("    .x1{\r\n");
      out.write("        background: url(college/photos/abc.jpg);\r\n");
      out.write("        background-size: 100% 100%;\r\n");
      out.write("        height: 100px;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .Register\r\n");
      out.write("{\r\n");
      out.write("\theight:350px;\r\n");
      out.write("\twidth:450px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tborder:2px solid #000;\r\n");
      out.write("\tborder-radius:30px;\r\n");
      out.write("\tmargin-left:450px;\r\n");
      out.write("\tpadding:0 0 50px 0;\r\n");
      out.write("        background-image: url(college/photos/istockphoto-1182211320-612x612.jpg);\r\n");
      out.write("        background-size: 100% 100%;\r\n");
      out.write("}\r\n");
      out.write(".head\r\n");
      out.write("{\r\n");
      out.write("\theight:70px;\r\n");
      out.write("\twidth:445px;\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tborder-radius:28px 28px 0 0;\r\n");
      out.write("\tline-height:80px;\r\n");
      out.write("\tfont-size:40px;\r\n");
      out.write("        font-family: serif;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("        text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write(".row\r\n");
      out.write("{\r\n");
      out.write("\twidth:450px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tmargin-top:30px;\r\n");
      out.write("}\r\n");
      out.write(".row2\r\n");
      out.write("{\r\n");
      out.write("\twidth:450px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tmargin-top:30px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write(".s1\r\n");
      out.write("{\r\n");
      out.write("\twidth:160px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tline-height:50px;\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("        font-family: serif;\r\n");
      out.write("\tpadding-left:20px;\r\n");
      out.write("\theight:inherit;\r\n");
      out.write("\tfont-size:24px;\r\n");
      out.write("}\r\n");
      out.write(".s2\r\n");
      out.write("{\r\n");
      out.write("\twidth:240px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tline-height:50px;\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tpadding-left:20px;\r\n");
      out.write("\theight:inherit;\r\n");
      out.write("        font-family: serif;\r\n");
      out.write("}\r\n");
      out.write(".fld\r\n");
      out.write("{\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\twidth:205px;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\tmargin-top:10px;\r\n");
      out.write("}\r\n");
      out.write(".slash\r\n");
      out.write("{\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\twidth:100px;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("        background: #000;\r\n");
      out.write("        color:#ffffff;\r\n");
      out.write("\tborder-radius:20px;\r\n");
      out.write("\tfont-size:28px;\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("}\r\n");
      out.write(".slash:hover\r\n");
      out.write("{\r\n");
      out.write("    background: #ffffff;\r\n");
      out.write("    color: #000;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    <script>\r\n");
      out.write("\t\t\t$(document).ready(function(e) {\r\n");
      out.write("                                    $(\".Register\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$(\".x1\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t$(\".Register\").slideToggle(2000);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("    <h1 class=\"x1\">Login to Fee Management System  </h1>\r\n");
      out.write("    <form method=\"post\" action=\"checklogin.jsp\">\r\n");
      out.write("        <div class=\"register\">\r\n");
      out.write("            <div class=\"head\">LOGIN</div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <p><div class=\"s1\">Email:</div>\r\n");
      out.write("                <div class=\"s2\"><input type=\"email\" name=\"t1\" placeholder=\"enter email\"  id=\"txt1\" class=\"fld\"/></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            <p><div class=\"s1\">Password:</div>\r\n");
      out.write("            <div class=\"s2\"> <input type=\"password\" placeholder=\"enter password\" name=\"t2\" id=\"txt2\" class=\"fld\"/></p></div> \r\n");
      out.write("            </div\r\n");
      out.write("            <p><div class=\"row2\"><button type=\"submit\" name=\"b1\" id=\"btn1\" class=\"slash\" >Login</button></div></p>\r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("             \r\n");
      out.write("    ");
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
