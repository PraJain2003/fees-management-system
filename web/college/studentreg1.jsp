<%@page import="pranjal_fees_management.mylib"%>
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
<h1>Student Registration</h1>

<%
    //recieve form data
    String name,address,contact,branch,email;
    name=request.getParameter("t1");
    address=request.getParameter("t2");
    contact=request.getParameter("t3");
    branch=request.getParameter("t4");
    email=request.getParameter("t5");
   
    
    
    Connection cn=new mylib().connect();
    //create sql command
    String sql="insert into studentdata values(0,?,?,?,?,?)";
        String s1="insert into logindata values(?,?,?)";

    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    // replace ? with data
    p1.setString(1,name);
    p1.setString(2,address);
    p1.setString(3,contact);
    p1.setString(4,branch);
    p1.setString(5,email);

    
   
   
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
<h1><a href="showstudent.jsp">Show student</a></h1>