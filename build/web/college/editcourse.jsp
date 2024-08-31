<%@page import="pranjal_fees_management.mylib"%>
<%@page import="java.sql.*" %>
<%
    String stu_id=request.getParameter("t1");
    String course_id=request.getParameter("t2");
    String course_name=request.getParameter("t3");
        String course_fees=request.getParameter("t4");

    Connection cn=new mylib().connect();
    
    String s1="select * from coursedata where course_id=?";
    PreparedStatement p1=cn.prepareStatement(s1);
    p1.setInt(1, Integer.parseInt(course_id));
    ResultSet r1=p1.executeQuery();
    if(r1.next())
    {
        String a;
        a=r1.getString("course_fees");      
%>
<h1>Discount</h1>
<form method="post" action="editcourse1.jsp">
    <input type="hidden" name="t1" value="<%= stu_id %>"/>
    <p>course_id<input type="hidden" name="t2" value="<%= course_id %>"/></p>
    <p>course_name<input type="text" name="t3" value="<%= course_name %>"/></p>
        <p>course_fees<input type="text" name="t4" value="<%= course_fees %>"/></p>

    <p><button type="submit" name="b1" id="btn1">changes</button></p>
</form> 
<%
    }
    
    
%>