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
<h1>delete and save</h1>
<%
    String stu_id=request.getParameter("H1");
    if(stu_id==null)
        
    {
        %>
        <h3><a href="showstudent.jsp">Select record</a></h3>
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
        String sql="select * from studentdata where stu_id=?";
        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, stu_id);
        //Fetch data
        ResultSet r1=p1.executeQuery();

        if(r1.next())
        {
            String a,b,c,d,f,g;
            a=r1.getString("name");
            b=r1.getString("address");
            c=r1.getString("contact");
            d=r1.getString("branch");
            f=r1.getString("email");
            g=r1.getString("stu_id");

%>

<form method="post" action="deletestudent1.jsp">
    <p>name :<input value="<%= a %>" type="text" name="t1" id="txt1" /></p>
    <p> address: <input value="<%= b%>" type="text" name="t2" id="txt2" /></p>
    <p>contact:<input value="<%= c %>" type="text" name="t3" id="txt3" /></p>
    <p>branch:<input value="<%= d %>" type="text" name="t4" id="txt4" /></p>
    <p>email:<input readonly value="<%= f %>" type="text" name="t6" id="txt6" /></p>
        <p>stu_id:<input readonly value="<%= g %>" type="text" name="t7" id="txt7" /></p>

    <button type="submit" id="btn" class="btn1">Delete</button> 
</form>
    <h3><a href="showstudent.jsp">Back</a></h3>
</center>
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