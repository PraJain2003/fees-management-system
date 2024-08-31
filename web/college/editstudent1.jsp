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
%>
<h1>delete and Save</h1>
<%
    //Receive form data
   String name,address,contact,branch,email,stu_id;
    name=request.getParameter("t1");
    address=request.getParameter("t2");
    contact=request.getParameter("t3");
    branch=request.getParameter("t4");
    email=request.getParameter("t6");
    stu_id=request.getParameter("t7");

    
    
    
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="update studentdata set name=?,address=?,contact=?,branch=?,email=? where stu_id=?";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Replace ? with data
        p1.setString(6,stu_id);
    p1.setString(1,name);
    p1.setString(2,address);
    p1.setString(3,contact);
    p1.setString(4,branch);
    p1.setString(5,email);

    
    
    
    
    
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
    
    <h3><a href="showstudent.jsp">Continue</a></h3> 
