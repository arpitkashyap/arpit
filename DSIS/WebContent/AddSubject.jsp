<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

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

		<!-- Page Content -->
		<div id="page-content-wrapper">
			
						
							<br>
						</div>
						<s:form class="form-horizontal" name="AddSubject" method="post" action="AddSubject">

							<div class="form-group" align="center">
								<label for="Subject Id" class="col-sm-2 control-label">Subject
									Id:</label>
								<div class="col-lg-2">
									<input type="text" class="form-control" required="required" name="Subject_Id"
										id="Subject Id" placeholder="Subject Id">
								</div>
							</div>

							<div class="form-group" align="center">
								<label for="Subject Name" class="col-sm-2 control-label">Subject
									Name:</label>
								<div class="col-lg-2">
									<input type="text" class="form-control" required="required" name="Subject_Name"
										id="Subject Name" placeholder="Subject Name">
								</div>
							</div>


							<div class="form-group" align="center">
								<label for="Credit" class="col-sm-2 control-label">Credit:</label>
								<div class="col-lg-2">
									<input type="text" class="form-control" name="Credit"
										id="Credit" placeholder="Credit">
								</div>
							</div>
							<div class="form-group" align="center">
								<label for="Specialization" class="col-sm-2 control-label">Specialization:</label>
								<div class="col-lg-2">
								<select  class="form-control" name="Specialization">
									<option value="1">SE</option>
									<option value="2">DS</option>
									<option value="3">NCE</option>
									<option value="4">CS</option>
								</select>
									
								</div>
							</div>
							<div class="form-group" align="center">
								<label for="Semester" class="col-sm-2 control-label">Semester:</label>
								<div class="col-lg-2">
								
								<select  class="form-control" name="Semester">
									<option value="1">Sem 1</option>
									<option value="2">Sem 2</option>
									<option value="3">Sem 3</option>
									<option value="4">Sem 4</option>
								</select>
								</div>
							</div>


							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-2">
									<div class="form-group">
										<button type="submit"  class="btn btn-primary" onclick="save()">Add Subject</button>
									</div>



								</div>
							</div>
						</s:form>
					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- /#page-content-wrapper -->

	<div id="page-content-wrapper">
		<div class="container-fluid" align="center"></div>
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
