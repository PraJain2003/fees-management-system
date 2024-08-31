<%@page import="java.sql.*"%>
<%
String email,password,btn;
email=request.getParameter("t1");
password=request.getParameter("t2");
btn=request.getParameter("b1");
if(btn==null)
{
    response.sendRedirect("loginerror.jsp");
}
else
{
    Class.forName("com.mysql.jdbc.Driver");
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    String S1="select * from logindata where email=? and password=?";
    PreparedStatement p1=cn.prepareStatement(S1);
    p1.setString(1, email);
    p1.setString(2, password);
    ResultSet r1=p1.executeQuery();
    if(r1.next())
    {
        String ut=r1.getString("usertype");
        //create session
        session=request.getSession(true); //true-create session if doest not exist other use existing
        session.setAttribute("email", email);
        session.setAttribute("usertype", ut);
        //send to page
        if(ut.equalsIgnoreCase("admin"))
        {
            response.sendRedirect("admin/adminhome.jsp");
            
        }
        else if(ut.equalsIgnoreCase("college"))
        {
            response.sendRedirect("college/collegehome.jsp");
            
        }
    }
    else
    {
        response.sendRedirect("loginerror.jsp");
    }
}
%>
