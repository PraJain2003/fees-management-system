<%@page import="pranjal_fees_management.mylib"%>
<%@page import="java.sql.*" %>
<%
    String stu_id=request.getParameter("t1");
    String cid=request.getParameter("t2");
        String course_name=request.getParameter("t3");
    String course_fees=request.getParameter("t4");
    Connection cn=new mylib().connect();
    String s1="update coursedata set course_name=?,course_fees=? where course_id=?";
    PreparedStatement p1=cn.prepareStatement(s1);
    p1.setString(1, course_name);
    p1.setInt(2, Integer.parseInt(course_fees));
    p1.setInt(3, Integer.parseInt(cid));
    
    int a=p1.executeUpdate();
    if(a==1)
    {
        response.sendRedirect("view.jsp");
   
    }
    
%>
<a href="view.jsp">Show</a>

