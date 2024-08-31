<%@page import="java.sql.*"%>
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
<h1>Registered Student</h1>

<%
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    //load driver for mysql-connectivity with java

    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from studentdata";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    while(r1.next())
    {
        String a,b,c,d,e,g;
        a=r1.getString("name");
        b=r1.getString("address");
        c=r1.getString("contact");
        d=r1.getString("branch");
        e=r1.getString("email");
        g=r1.getString("stu_id");
       
        
        %>
       
        <h3>Stu_id:<%= g %></h3>
        
        <p>
           name: <%= a%><br/>
           address: <%= b %><br/>
            contact :<%= c %><br/>
            branch: <%= d %><br/>
            email: <%= e %><br/>
        </p>
        <form method="post" action="view.jsp">
            <input type="hidden" name="H1" value="<%= g %>" />
            <input type="submit" name="B1" class="btn1" value="View" />
        </form>
            
                  
        <%
    }
    
%>