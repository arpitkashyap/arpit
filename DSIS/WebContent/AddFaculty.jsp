<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<script type="text/javascript">
function save(){
	var id =  document.getElementById("Enroll");

	var Name =  document.getElementById("Name");
	var email=   document.getElementById("email");
	//var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
	var flag=1;
	
	if(id.value=="")
	{
		alert("ID can not be blank....");
		flag=0;
		
	}
	if(Name.value=="")
	{
		alert("Name can not be blank....");
		flag=0;
	}
	if(flag!=0)
	{
		mainPage.submit();
	}
}

</script>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   

    <title>SIS</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

</head>

<body id="body">

    <div id="wrapper">

        <%@include file="/sidebar.jsp" %>
       <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
<form class="form-horizontal"  method="post" action="hello1" name="mainPage" id="mainPage">
<s:actionmessage/>
<s:actionerror/>
<div class="form-group">
	<label for="inputEmail3" class="col-sm-2 control-label">ID:</label>
	<div class="col-sm-3 ">
		<input type="email" class="form-control" name="Id" placeholder="ENTER ID" id="Enroll" />
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">First_Name:</label>
	<div class="col-sm-3">
		<input type="text" class="form-control" name="Name" placeholder="ENTER FIRST NAME"  id ="Name"/>
	</div>
</div>
<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Password:</label>
	<div class="col-sm-3">
		<input type="text" class="form-control" name="Password" placeholder="ENTER Password"  id ="Password"/>
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Email:</label>
	<div class="col-sm-3">
		<input type="email" class="form-control" name="email" required="required"  placeholder="ENTER EMAIL" id="email"/>
	</div>
</div> 

<div class="form-group">
	<div class="col-sm-offset-2 col-sm-3">
		<button type="button" class="btn btn-default" onclick="save()">REGISTER</button>
	</div>
</div>
</form>
            
            
             </div>
          </div>

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
       
</body>

</html>