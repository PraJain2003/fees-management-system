<%@include file="admin2.jsp" %>
<center>
<h1>Change password</h1>

<form method="post" class="r1"action="changepassword1.jsp">
    <p>new_pass:<input type="text" name="t1" id="txt1"</p>
    <p>old_pass:<input type="text" name="t2" id="txt2"</p>
    <p>confirm_pass:<input type="text" name="t3" id="txt3"</p>
    
    <p><button type="submit" class="btn1">submit</button></p>
</form>
</center>
<style>
    h1{
        font-size: 40px;
        font-family: serif;
    }
    .r1
    {
        font-size: 30px;
        font-family: serif;
        
    }
</style>
<%@include file="admin3.jsp" %>