<%@page import="java.sql.*"%>

<h1>college Registration</h1>

<%
    //recieve form data
    String name,contact,address,affiliation,email,password,confirm;
    name=request.getParameter("t1");
    contact=request.getParameter("t2");
    address=request.getParameter("t3");
    affiliation=request.getParameter("t4");
    email=request.getParameter("t5");
    password=request.getParameter("t6");
    confirm=request.getParameter("t7");
    
    
    //load driever with mysql connectivity
    Class.forName("com.mysql.jdbc.Driver");
    //create connection with mysql
    String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    //create sql command
    String sql="insert into collegedata values(?,?,?,?,?)";
    String s1="insert into logindata values(?,?,?)";
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
     PreparedStatement p2=cn.prepareStatement(s1);
    // replace ? with data
    p1.setString(1,name);
    p1.setString(2,contact);
    p1.setString(3,address);
    p1.setString(4,affiliation);
    p1.setString(5,email);
    
    p2.setString(1,email);
    p2.setString(2,password);
    p2.setString(3,"college");
   
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
<h1><a href="showcollege.jsp">Show college</a></h1>