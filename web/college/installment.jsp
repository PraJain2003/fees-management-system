<%@page import="pranjal_fees_management.mylib"%>
<%@page  import="java.sql.*" %> 
<h2>Deposit fees</h2>
<%
    String stu_id,course_fees,course_id;
    stu_id=request.getParameter("S1");
    course_id=request.getParameter("S2");
    course_fees=request.getParameter("S3");
    
        Class.forName("com.mysql.jdbc.Driver");
        String path="jdbc:mysql://localhost:3306/feemanagementsystem";
        String dbuser="root";
        String dbpass="";
        String sql= "select * from coursedata where stu_id=? and course_id=?";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpass);
            PreparedStatement p1=cn.prepareStatement(sql);
             java.sql.Date dt=new java.sql.Date(new java.util.Date().getTime());
             p1.setInt(1,Integer.parseInt(stu_id));
             p1.setInt(2,Integer.parseInt(course_id));
             ResultSet r1=p1.executeQuery();

             if(r1.next())
             {
                 String a,c,d;
                 int f=r1.getInt("stu_id");
                 int e=r1.getInt("course_id");
                 a=r1.getString("course_name");
                 int b=r1.getInt("course_fees");
                 c=r1.getString("duration");
                 d=r1.getString("commencement_date");
          %>
          <h3><%= e %>.<%= a %></h3>
          <p>Fees: <%= b %><br/></p>
          <p>Duration: <%= c%></p>
          <p>Commencement_date: <%= dt %></p>

          <form method="post" action="installment1.jsp">
              <input type="hidden" name="h1" value="<%= f %>"/>
              <input type="hidden" name="h2" value="<%= e %>"/>
              <p>Amount to pay:<input type="text" name="txt1"/></p>
              <p>Remark :<input type="text" name="txt2"/></p>
              <button type="submit">Submit</button>     
          </form>

         <%
             }
         %>

    
