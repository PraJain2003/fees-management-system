<%@page import="java.sql.*" %>
<%
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
%>
<%
    //Receive form data
   String new_pass,old_pass,confirm_pass;
    new_pass=request.getParameter("t1");
    old_pass=request.getParameter("t2");
    confirm_pass=request.getParameter("t3");
    
    
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="update logindata set password=? where email=? and password=?";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Replace ? with data
    
    p1.setString(1, new_pass);
    p1.setString(2, e1);
    p1.setString(3, old_pass);
    
    
    
    //send data to table
    int a=p1.executeUpdate();
    String msg="";
    if(a==1)
    {
        msg="Data is saved successfully";
    }
    else
    {
        msg="Error : cannot save data";
    }
    
%>
<h3><%=msg%></h3>
<h3><a href="../login.jsp">Continue</a></h3> 