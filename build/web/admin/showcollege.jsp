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
<h2>Show College details</h2>

<%
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from collegedata";
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    
    while(r1.next())
    {
        String a,b,c,d,e;
        a=r1.getString("name");
        b=r1.getString("contact");
        c=r1.getString("address");
        d=r1.getString("affiliation");
        e=r1.getString("email");
        
        %>
        <p>
           Name: <%= a %><br/>
           Address : <%= b %><br/>
            Contact :<%= c %><br/>
            Affiliation :<%= d %><br/>
            Email: <%= e %><br/>
            
            
        </p>
        <form method="post" action="editcollege.jsp">
            <input type="hidden" name="H1" value="<%= e%>" />
            <input type="submit" name="B1" class="btn1" value="Edit" />
        </form>
            <form method="post" action="deletecollege.jsp">
            <input type="hidden" name="H1" value="<%= e %>" />
            <input type="submit" name="B1"  class="btn1"value="Delete" />
        </form>
        <%
    }
    
%>
</center>
<%@include file="admin3.jsp" %>