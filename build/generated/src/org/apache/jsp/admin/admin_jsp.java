package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("\n");
      out.write(".d1\n");
      out.write("{\n");
      out.write("\tbackground-image:url(../college/photos/black-1072366_640.webp);\n");
      out.write("        background-size: 100% 100%;\n");
      out.write("}\n");
      out.write(".m1\n");
      out.write("{\n");
      out.write("    background-image: url(../college/photos/istockphoto-1211641419-612x612.jpg);\n");
      out.write("    background-size: 100% 100%;\n");
      out.write("    height: 500px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<link href=\"../styles/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"../styles/js/bootstrap.bundle.js\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark d1\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("      \n");
      out.write("      <a class=\"navbar-brand\" style=\"font-size:28px; font-family:serif;\" href=\"#\" >ADMIN</a>                                               \n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\n");
      out.write("      <ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px;\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" style=\"font-size:20px; font-family:serif; \"href=\"adminhome.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarScrollingDropdown\" style=\"font-size:20px; font-family:serif;\"role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Admin\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\n");
      out.write("              <li><a class=\"dropdown-item\" style=\"font-size:18px; font-family:serif; \"href=\"adminreg.jsp\">Admin</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\"  style=\"font-size:18px; font-family:serif;\"href=\"showadmin.jsp\">Show</a></li>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"changepassword.jsp\" style=\"font-size:18px; font-family:serif;\">Change Password</a></li>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" style=\"font-size:20px; font-family:serif;\"id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            College\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\n");
      out.write("              <li><a class=\"dropdown-item\"style=\"font-size:18px; font-family:serif;\" href=\"college.jsp\">Register</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"showcollege.jsp\" style=\"font-size:18px; font-family:serif;\">Manage</a></li>\n");
      out.write("        \n");
      out.write("            <li><a class=\"dropdown-item\" href=\"../college/changepassword.jsp\" style=\"font-size:18px; font-family:serif;\">Change Password</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" href=\"../logout.jsp\" style=\"font-size:20px; font-family:serif;\" aria-current=\"page\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("        <form class=\"d-flex\">\n");
      out.write("        <input class=\"form-control me-3\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <div class=\"m1\">ADMIN HOME</div>");
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
