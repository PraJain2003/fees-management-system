package org.apache.jsp.college;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pranjal_fees_management.mylib;
import java.sql.*;

public final class installment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<h2>Deposit fees</h2>\n");

    String stu_id,course_fees,course_id;
    stu_id=request.getParameter("S1");
    course_id=request.getParameter("S2");
    course_fees=request.getParameter("S3");
    
        Class.forName("com.mysql.jdbc.Driver");
        String path="jdbc:mysql://localhost:3306/feemanagementsystem";
        String dbuser="root";
        String dbpass="";
        String sql= "select * from coursedata where stu_id=? and course_id=?";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpass);
            PreparedStatement p1=cn.prepareStatement(sql);
             java.sql.Date dt=new java.sql.Date(new java.util.Date().getTime());
             p1.setInt(1,Integer.parseInt(stu_id));
             p1.setInt(2,Integer.parseInt(course_id));
             ResultSet r1=p1.executeQuery();

             if(r1.next())
             {
                 String a,c,d;
                 int f=r1.getInt("stu_id");
                 int e=r1.getInt("course_id");
                 a=r1.getString("course_name");
                 int b=r1.getInt("course_fees");
                 c=r1.getString("duration");
                 d=r1.getString("commencement_date");
          
      out.write("\n");
      out.write("          <h3>");
      out.print( e );
      out.write('.');
      out.print( a );
      out.write("</h3>\n");
      out.write("          <p>Fees: ");
      out.print( b );
      out.write("<br/></p>\n");
      out.write("          <p>Duration: ");
      out.print( c);
      out.write("</p>\n");
      out.write("          <p>Commencement_date: ");
      out.print( dt );
      out.write("</p>\n");
      out.write("\n");
      out.write("          <form method=\"post\" action=\"installment1.jsp\">\n");
      out.write("              <input type=\"hidden\" name=\"h1\" value=\"");
      out.print( f );
      out.write("\"/>\n");
      out.write("              <input type=\"hidden\" name=\"h2\" value=\"");
      out.print( e );
      out.write("\"/>\n");
      out.write("              <p>Amount to pay:<input type=\"text\" name=\"txt1\"/></p>\n");
      out.write("              <p>Remark :<input type=\"text\" name=\"txt2\"/></p>\n");
      out.write("              <button type=\"submit\">Submit</button>     \n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("         ");

             }
         
      out.write("\n");
      out.write("\n");
      out.write("    \n");
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
