<%@page import="java.sql.*" %>
<%@include file="admin2.jsp" %>

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
<center>
<h1>Edit and Save</h1>
<%
    //Receive form data
    String name,contact,address,affiliation,email,password,confirm;
    name=request.getParameter("t1");
    contact=request.getParameter("t2");
    address=request.getParameter("t3");
    affiliation=request.getParameter("t4");
    email=request.getParameter("t5");
    password=request.getParameter("t6");
    confirm=request.getParameter("t7");
    
    
    
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="update collegedata set name=?,contact=?,address=?,affiliation=? where email=?";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Replace ? with data
    p1.setString(5, email);
    p1.setString(1, name);
    p1.setString(2, contact);
    p1.setString(3, address);
    p1.setString(4, affiliation);
    
    
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
            
    <h3><a href="showcollege.jsp">Continue</a></h3> 
</center>
    <%@include file="admin3.jsp" %>