<%@page import="java.sql.*"%>
<h1>Course registration</h1>
<table border="2px" style="border-collapse: collapse">
    <tr>
        <th>course_id</th>
        <th>course_name</th>
        <th>course_fees</th>
        <th>duration</th>

    </tr>
    <%
        String stu_id=request.getParameter("t1");
        System.out.println(stu_id);
        Class.forName("com.mysql.jdbc.Driver");
        String path="jdbc:mysql://localhost:3306/feemanagementsystem";
        String dbuser="root";
        String dbpass="";
        Connection cn=DriverManager.getConnection(path, dbuser, dbpass);
    String sql="select * from course_master";
    PreparedStatement p1=cn.prepareStatement(sql);
     ResultSet r1=p1.executeQuery();
    
    while(r1.next())
    {
        String a,b,c,d;
        a=r1.getString("course_id");
        b=r1.getString("course_name");
        c=r1.getString("course_fees");
        d=r1.getString("duration");

        %>
        <tr>
            <td><%= a%></td>
           <td><%= b%></td>
            <td><%=c%></td>
            <td><%= d%></td>
            
            <td>
                <form method="post" action="addcourse1.jsp">
                    <input type="hidden" name="t1" value="<%= stu_id%>">
                    <input type="hidden" name="t2" value="<%= a %>">
                    <input type="hidden" name="t3" value="<%= b %>">
                    <input type="hidden" name="t4" value="<%= c%>">
                    <input type="hidden" name="t5" value="<%= d %>">

                    <button type="submit" class="btn">add</button>
                </form>
            </td>
        </tr>
       
        <%
    }
    %>
</table>