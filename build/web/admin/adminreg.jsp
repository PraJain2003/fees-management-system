<%@include file="admin2.jsp" %>
<h1>Admin Data Register</h1>

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
<style>
    h1{
        padding-left: 85px;
        font-family: serif;
        font-size: 50px;
    }
    .row
{
	width:70%;
	height:inherit;
	float:left;
}
.row2
{
	width:40%;
	height:50px;
	float:left;
	margin-top:30px;
	text-align:center;
        margin-bottom: 20px;
}
    .s1
{
	width:30%;
	float:left;
	line-height:30px;
	color:#000;
        font-family: serif;
	height:inherit;
	font-size:24px;
        text-align: center;
}
.s2
{
	width:35%;
	float:left;
	line-height:25px;
	color:#000;
	height:inherit;
        font-family: serif;
        text-align: center;
}
#slash
{
	height:50px;
	width:140px;
	border:none;
        background: #000;
        color:#ffffff;
	border-radius:20px;
	font-size:28px;
	cursor:pointer;
}
#slash:hover
{
    background: #ffffff;
    color: #000;
}
</style>
<form method="post" action="adminreg1.jsp">
    <div class="row">
    <p><div class="s1">Name:</div>
    <div class="s2"><input type="text" name="t1" id="txt1"></div></p>
    <p><div class="s1">Contact:</div>
    <div class="s2"><input type="text" name="t2" id="txt2"></div></p>
    <p><div class="s1">Address:</div>
    <div class="s2"><input type="text" name="t3" id="txt3"></div></p>
    <p><div class="s1">Email:</div>
    <div class="s2"><input type="text" name="t4" id="txt4"></div></p>
    <p><div class="s1">Password:</div>
    <div class="s2"><input type="text" name="t5" id="txt5"></div></p>
    <p><div class="s1">Confirm Password:</div>
    <div class="s2"><input type="text" name="t6" id="txt6"></div></p>
    </div>
    
    <p><div class="row2"><button type="submit" class="btn1" id="slash">Register</button></div></p>
</form>
<%@include file="admin3.jsp" %>