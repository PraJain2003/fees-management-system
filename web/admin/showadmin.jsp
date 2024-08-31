<%@include file="admin2.jsp" %>
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
<style>
    h2{
        font-family: serif;
        font-size: 50px;
        
        
    }
    p{
        font-family: serif;
        font-size: 30px;
        
    }
</style>
<center>
<h2>Show Admin details</h2>

<%
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
        
        %>
        <p>
           Name: <%= a %><br/>
           Address : <%= b %><br/>
            Contact :<%= c %><br/>
            Email: <%= d %><br/>
            
            
        </p>
        <%
    }
    
%>
</center>
<%@include file="admin3.jsp" %>