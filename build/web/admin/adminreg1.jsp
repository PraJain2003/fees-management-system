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
<h1>Admin Registration</h1>

<%
    //recieve form data
    String name,contact,address,email,password,confirm;
    name=request.getParameter("t1");
    contact=request.getParameter("t2");
    address=request.getParameter("t3");
    email=request.getParameter("t4");
    password=request.getParameter("t5");
    confirm=request.getParameter("t6");
    
    
    //load driever with mysql connectivity
    Class.forName("com.mysql.jdbc.Driver");
    //create connection with mysql
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    //create sql command
    String sql="insert into admindata values(?,?,?,?)";
    String s1="insert into logindata values(?,?,?)";
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
     PreparedStatement p2=cn.prepareStatement(s1);
    // replace ? with data
    p1.setString(1,name);
    p1.setString(2,contact);
    p1.setString(3,address);
    p1.setString(4,email);
    
    p2.setString(1,email);
    p2.setString(2,password);
    p2.setString(3,"admin");
   
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
    int b=p2.executeUpdate();
    
    String msga="";
    if(b==1)
    {
        msga="data is saved successfully";
    }
    else
    {
        msga="error:cannot save data";
    }
    
    
%>
<h3><%=msg%></h3>
<h1><a href="showadmin.jsp">Show Admin</a></h1>