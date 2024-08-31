<%@page import="java.sql.*" %>
<%  
    String stu_id=request.getParameter("h1");
    String course_id=request.getParameter("h2");
    String amount=request.getParameter("txt1");
    String remark=request.getParameter("txt2");
    
    Class.forName("com.mysql.jdbc.Driver");
    String path="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    String sql="insert into installmentdata values(0,?,?,?,?,?)";
    Connection cn=DriverManager.getConnection(path,dbuser,dbpass);
    PreparedStatement p1=cn.prepareStatement(sql);
    java.sql.Date dt=new java.sql.Date(new java.util.Date().getTime());
    p1.setString(1, stu_id);
    p1.setString(2, course_id);
    p1.setString(3, amount);
    p1.setDate(4, dt);
    p1.setString(5, remark);
    
    int a=p1.executeUpdate();
    if(a==1)
    {
        response.sendRedirect("view.jsp");
    }

%>