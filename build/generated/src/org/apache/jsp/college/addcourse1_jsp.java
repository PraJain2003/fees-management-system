package org.apache.jsp.college;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addcourse1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>add course</h1>\n");
      out.write("\n");

    //recieve form data
    String stu_id,course_id,course_name,course_fees,duration,commencement_date;
    stu_id=request.getParameter("t1");
    course_id=request.getParameter("t2");
    course_name=request.getParameter("t3");
    course_fees=request.getParameter("t4");
    duration=request.getParameter("t5");
    commencement_date=request.getParameter("t6");
    //load driever with mysql connectivity
    Class.forName("com.mysql.jdbc.Driver");
    //create connection with mysql
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    //create sql command
    String sql="insert into coursedata values(0,?,?,?,?,?,?)";
    java.sql.Date dt=new java.sql.Date(new java.util.Date().getTime());
System.out.println("hello1");
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    // replace ? with data
    p1.setString(1,stu_id);
    p1.setString(2,course_id);
    p1.setString(3,course_name);
    p1.setString(4,course_fees);
    p1.setString(5,duration);
    p1.setDate(6,dt);
   
    //senddata to table
    int a=p1.executeUpdate();
    String msg="";
    if(a==1)
    {
        msg="Data is saved successfully";
    }
    else
    {
        msg="error:cannot save data";
    }
    

      out.write("\n");
      out.write("<h3>");
      out.print(msg);
      out.write("</h3>\n");
      out.write("<h1><a href=\"addcourse.jsp\">back</a></h1>\n");
      out.write("<h3><a href=\"view.jsp\">Show</a></h3>\n");
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
