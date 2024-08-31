<%@page import="java.sql.*" %>
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
<h1>College home</h1>
<h1><a href="studentreg.jsp">Student Reg</a></h1>
<h1><a href="changepassword.jsp">Changepassword</a></h1>
<h1><a href="showstudent.jsp">showstudent</a></h1>
<h1><a href="addcourse.jsp">addcourse</a></h1>

