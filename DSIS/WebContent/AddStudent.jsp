<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
<script type="text/javascript">
	function save() {
		var id = document.getElementById("Enroll");
		var Name = document.getElementById("Name");
		//var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
		var flag = 1;

		if (id.value == "") {
			alert("Enrollement can not be blank....");
			flag = 0;

		}
		if (Name.value == "") {
			alert("Name can not be blank....");
			flag = 0;
		}
		if (flag != 0) {
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
				<form class="form-horizontal"  method="post"
					action="hello" name="mainPage" id="mainPage"
					enctype="multipart/form-data">
					<s:actionmessage />
					<s:actionerror />
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">Enrollement:</label>
						<div class="col-sm-3 ">
							<input type="text" class="form-control" name="Enroll"
								placeholder="ENTER ENROLLMENT NO." id="Enroll" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">First_Name:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="Name"
								placeholder="ENTER FIRST NAME" id="Name" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Password:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="Password"
								placeholder="ENTER Password" id="Password" />
						</div>
					</div>
					
					
					
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Last_Name:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="Lastname"
								required="required" placeholder="ENTER LAST NAME" id="Lastname" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Email:</label>
						<div class="col-sm-3">
							<input type="email" class="form-control" name="email"
								placeholder="ENTER EMAIL" id="email" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Contact:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="Contact"
								placeholder="ENTER CONTACT NO" id="Contact" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Address:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="Address"
								placeholder="ENTER FULL ADDRESS" />
						</div>
					</div>
										
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label" >Image:</label>
						<div class="col-sm-3">
							<input type="file"  class="form-control" name="photo" />
						</div>
					</div>
					<div class="form-group">
						<label for="Birthplace015" class="col-sm-2 control-label">Birthplace015:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="Birthplace015"
								placeholder="ENTER Birthplace" id="Birthplace015" />
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