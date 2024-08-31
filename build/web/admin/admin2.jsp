<head>
    <style>

.d1
{
	background-image:url(../college/photos/black-1072366_640.webp);
        background-size: 100% 100%;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<link href="../styles/css/bootstrap.css" rel="stylesheet" type="text/css" />
<script src="../styles/js/bootstrap.bundle.js" type="text/javascript">

</script>
<body>
<nav class="navbar navbar-expand-lg navbar-dark d1">
  <div class="container-fluid">
      
      <a class="navbar-brand" style="font-size:28px; font-family:serif;" href="#" >ADMIN</a>                                               
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" style="font-size:20px; font-family:serif; "href="adminhome.jsp">Home</a>
        </li>
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown" style="font-size:20px; font-family:serif;"role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Admin
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
              <li><a class="dropdown-item" style="font-size:18px; font-family:serif; "href="adminreg.jsp">Admin</a></li>
              <li><a class="dropdown-item"  style="font-size:18px; font-family:serif;"href="showadmin.jsp">Show</a></li>
        </li>
        <li><a class="dropdown-item" href="changepassword.jsp" style="font-size:18px; font-family:serif;">Change Password</a></li>

        
      </ul>
              <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" style="font-size:20px; font-family:serif;"id="navbarScrollingDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            College
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
              <li><a class="dropdown-item"style="font-size:18px; font-family:serif;" href="college.jsp">Register</a></li>
            <li><a class="dropdown-item" href="showcollege.jsp" style="font-size:18px; font-family:serif;">Manage</a></li>
        
            <li><a class="dropdown-item" href="../college/changepassword.jsp" style="font-size:18px; font-family:serif;">Change Password</a></li>
        
      </ul>
      <li class="nav-item">
          <a class="nav-link active" href="../logout.jsp" style="font-size:20px; font-family:serif;" aria-current="page">Logout</a>
        </li>
      
    </div>
        <form class="d-flex">
        <input class="form-control me-3" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-light" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>