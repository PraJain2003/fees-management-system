
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
<h1>add course</h1>

<%
    //recieve form data
    String stu_id,course_id,course_name,course_fees,duration,commencement_date;
    stu_id=request.getParameter("t1");
    course_id=request.getParameter("t2");
    course_name=request.getParameter("t3");
    course_fees=request.getParameter("t4");
    duration=request.getParameter("t5");
    //load driever with mysql connectivity
    Class.forName("com.mysql.jdbc.Driver");
    //create connection with mysql
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    //create sql command
    String sql="insert into coursedata values(0,?,?,?,?,?,?)";
    java.sql.Date dt=new java.sql.Date(new java.util.Date().getTime());
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    // replace ? with data
    p1.setString(1,stu_id);
    p1.setString(2,course_id);
    p1.setString(3,course_name);
    p1.setString(4,course_fees);
    p1.setString(5,duration);
    p1.setDate(6,dt);
   
    //senddata to table
    int a=p1.executeUpdate();
    String msg="";
    if(a==1)
    {
        msg="Data is saved successfully";
    }
    else
    {
        msg="error:cannot save data";
    }
    
%>
<h3><%=msg%></h3>
<h1><a href="addcourse.jsp">back</a></h1>
<h3><a href="view.jsp">Show</a></h3>
