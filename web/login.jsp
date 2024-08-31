<%@include file="general2.jsp" %>
<script src="styles/js/jquery.js"></script>
<style>
    h1
    {
        padding-top: 20px;
        text-align: center;
        font-family: serif;
    }
    .x1{
        background: url(college/photos/abc.jpg);
        background-size: 100% 100%;
        height: 100px;
        color: #ffffff;
    }
    
    .Register
{
	height:350px;
	width:450px;
	float:left;
	border:2px solid #000;
	border-radius:30px;
	margin-left:450px;
	padding:0 0 50px 0;
        background-image: url(college/photos/istockphoto-1182211320-612x612.jpg);
        background-size: 100% 100%;
}
.head
{
	height:70px;
	width:445px;
	color:#000;
	text-align:center;
	border-radius:28px 28px 0 0;
	line-height:80px;
	font-size:40px;
        font-family: serif;
	float:left;
	font-weight:bold;
        text-decoration: underline;
}
.row
{
	width:450px;
	height:50px;
	float:left;
	margin-top:30px;
}
.row2
{
	width:450px;
	height:50px;
	float:left;
	margin-top:30px;
	text-align:center;
        font: bold;
}
.s1
{
	width:160px;
	float:left;
	line-height:50px;
	color:#000;
        font-family: serif;
	padding-left:20px;
	height:inherit;
	font-size:24px;
}
.s2
{
	width:240px;
	float:left;
	line-height:50px;
	color:#000;
	padding-left:20px;
	height:inherit;
        font-family: serif;
}
.fld
{
	height:30px;
	width:205px;
	border:none;
	margin-top:10px;
}

.slash
{
	height:50px;
	width:100px;
	border:none;
        color:#000;
	border-radius:20px;
	font-size:28px;
        font-family: sans-serif;
        text-decoration: underline;
        text-decoration-color: #000;
        font: bolder;
	cursor:pointer;
}
.slash:hover
{
    background: #ffffff;
    color: #000;
}
</style>
    <script>
			$(document).ready(function(e) {
                                    $(".Register").hide();

					$(".x1").click(function(){
						$(".Register").slideToggle(2000);
				});
            });


</script>
    <h1 class="x1">Login to Fee Management System  </h1>
    <form method="post" action="checklogin.jsp">
        <div class="register">
            <div class="head">LOGIN</div>
            
            <div class="row">
                <p><div class="s1">Email:</div>
                <div class="s2"><input type="email" name="t1" placeholder="enter email"  id="txt1" class="fld"/></p>
                </div>
            </div>
            <div class="row">
            <p><div class="s1">Password:</div>
            <div class="s2"> <input type="password" placeholder="enter password" name="t2" id="txt2" class="fld"/></p></div> 
            </div
            <p><div class="row2"><button type="submit" name="b1"  class="slash" >Login</button></div></p>
   
</div>
    </form>

   
    
             
    <%@include file="general3.jsp" %>
