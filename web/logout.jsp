<%@include file="general2.jsp" %>
<%
    session=request.getSession(false);//false-open only existing session
    if(session==null)
    {
        response.sendRedirect("login.jsp");
    }
    else
    {
        try
        {
            //remove session attributes
            session.removeAttribute("email");
            session.removeAttribute("usertype");
            session.invalidate();
            response.sendRedirect("login.jsp");
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("login.jsp");
        }
    }

%>
    <%@include file="general3.jsp" %>
