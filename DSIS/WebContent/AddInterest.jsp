<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>SIS</title>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/simple-sidebar.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		        <%@include file="/sidebar.jsp" %>
			<!-- jQuery -->
			<script src="js/jquery.js"></script>

			<!-- Bootstrap Core JavaScript -->
			<script src="js/bootstrap.min.js"></script>

			<!-- Menu Toggle Script -->
			<script>
				$("#menu-toggle").click(function(e) {
					e.preventDefault();
					$("#wrapper").toggleClass("toggled");
				});
			</script>
			<form class="form-horizontal" action="addInterest">
				<div class="form-group">
					<div class="col-md-3">
						<h3>LIST OF INTEREST</h3>
					</div>
					<div class="col-md-3">
						<s:iterator value="arr_interest">
							<input type="text" class="form-control"
								value="<s:property value="Interest"  />" size="2" />
							<br>

						</s:iterator>

					</div>
				</div>





				<div class="form-group">

					<label for="Interest" class="col-sm-2 control-label">ENTER
						INTEREST </label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="Interest" required
							placeholder="Enter Interest" size="50" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-3">
						<button type="submit" class="btn btn-default">ADD</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>

</html>
