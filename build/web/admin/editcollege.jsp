<%@page import="java.sql.*"%>
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
    String email=request.getParameter("H1");
    if(email==null)
        
    {
        %>
        <h3><a href="showcollege.jsp">Select record</a></h3>
        <%
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
        String sql="select * from collegedata where email=?";
        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, email);
        //Fetch data
        ResultSet r1=p1.executeQuery();

        if(r1.next())
        {
            String a,b,c,d,e;
            a=r1.getString("name");
            b=r1.getString("contact");
            c=r1.getString("address");
            d=r1.getString("affiliation");
            e=r1.getString("email");
%>

<form method="post" action="editcollege1.jsp">
    <p>name <input value="<%= a %>" type="text" name="t1" id="txt1" /></p>
    <p> contact <input value="<%= b%>" type="text" name="t2" id="txt2" /></p>
    <p>address <input value="<%= c %>" type="text" name="t3" id="txt3" /></p>
    <p>affiliation<input value="<%= d %>" type="text" name="t4" id="txt4" /></p>
    <p>email<input readonly value="<%= e %>" type="text" name="t5" id="txt5" /></p>
    <button type="submit" id="btn" class="btn1">Save </button> 
</form>
    <h3><a href="showcollege.jsp">Back</a></h3>
<%
        }//end of if r1.next
        else
        {
            %>
            <h3>Error : No data found</h3>
            <%
        }
    }//end of if in which we sent request to edit       }
%>

</center>
<%@include file="admin3.jsp" %>