package org.apache.jsp.college;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class deletestudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

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
            if(ut.equalsIgnoreCase("college")==false)
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
      out.write("<h1>delete and save</h1>\n");

    String stu_id=request.getParameter("H1");
    if(stu_id==null)
        
    {
        
      out.write("\n");
      out.write("        <h3><a href=\"showstudent.jsp\">Select record</a></h3>\n");
      out.write("        ");

    }
    else
    {
        Class.forName("com.mysql.jdbc.Driver");
    
        //Create conection
        String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
        String dbuser="root";
        String dbpass="";

        Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);

        //Create sql command
        String sql="select * from studentdata where stu_id=?";
        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, stu_id);
        //Fetch data
        ResultSet r1=p1.executeQuery();

        if(r1.next())
        {
            String a,b,c,d,e,f,g;
            a=r1.getString("name");
            b=r1.getString("address");
            c=r1.getString("contact");
            d=r1.getString("branch");
            e=r1.getString("course_name");
            f=r1.getString("email_college");
            g=r1.getString("stu_id");


      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"editstudent1.jsp\">\n");
      out.write("    <p>name :<input value=\"");
      out.print( a );
      out.write("\" type=\"text\" name=\"t1\" id=\"txt1\" /></p>\n");
      out.write("    <p> address: <input value=\"");
      out.print( b);
      out.write("\" type=\"text\" name=\"t2\" id=\"txt2\" /></p>\n");
      out.write("    <p>contact:<input value=\"");
      out.print( c );
      out.write("\" type=\"text\" name=\"t3\" id=\"txt3\" /></p>\n");
      out.write("    <p>branch:<input value=\"");
      out.print( d );
      out.write("\" type=\"text\" name=\"t4\" id=\"txt4\" /></p>\n");
      out.write("    <p>course_name:<input value=\"");
      out.print( e );
      out.write("\" type=\"text\" name=\"t5\" id=\"txt5\" /></p>\n");
      out.write("    <p>email_college:<input readonly value=\"");
      out.print( f );
      out.write("\" type=\"text\" name=\"t6\" id=\"txt6\" /></p>\n");
      out.write("        <p>stu_id:<input readonly value=\"");
      out.print( g );
      out.write("\" type=\"text\" name=\"t7\" id=\"txt7\" /></p>\n");
      out.write("\n");
      out.write("    <button type=\"submit\" id=\"btn\" class=\"btn1\">Delete</button> \n");
      out.write("</form>\n");
      out.write("    <h3><a href=\"showstudent.jsp\">Back</a></h3>\n");
      out.write("</center>\n");

        }//end of if r1.next
        else
        {
            
      out.write("\n");
      out.write("            <h3>Error : No data found</h3>\n");
      out.write("            ");

        }
    }//end of if in which we sent request to edit       }

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
