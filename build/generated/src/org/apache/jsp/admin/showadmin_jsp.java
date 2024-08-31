package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String e1="",ut="";
//open existring session
    session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("../autherror.jsp");
    }
    else
    {
        try
        {
            e1=session.getAttribute("email").toString();
            ut=session.getAttribute("usertype").toString();
            if(ut.equalsIgnoreCase("admin")==false)
            {
                response.sendRedirect("../autherror.jsp");
            }
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("../autherror.jsp");
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<h2>Show Admin details</h2>\n");
      out.write("\n");

    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from admindata where email=?";
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    p1.setString(1,e1);
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    
    if(r1.next())
    {
        String a,b,c,d;
        a=r1.getString("name");
        b=r1.getString("address");
        c=r1.getString("contact");
        d=r1.getString("email");
        
        
      out.write("\n");
      out.write("        <p>\n");
      out.write("           Name: ");
      out.print( a );
      out.write("<br/>\n");
      out.write("           Address : ");
      out.print( b );
      out.write("<br/>\n");
      out.write("            Contact :");
      out.print( c );
      out.write("<br/>\n");
      out.write("            Email: ");
      out.print( d );
      out.write("<br/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        ");

    }
    

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
