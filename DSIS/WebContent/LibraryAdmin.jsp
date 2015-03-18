<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">


  <head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   
 <script type="text/javascript">
		
 
</script> 
<!-- Load jQuery from Google's CDN -->
	<!-- Load jQuery UI CSS  -->
<link rel="stylesheet" href="jquery-ui.css" />
	<!-- Load jQuery JS -->
	<script src="jquery-1.9.1.js"></script>
	<!-- Load jQuery UI Main JS  -->
	<script src="jquery-ui.js"></script>
	<!-- Load SCRIPT.JS which will create datepicker for input field  -->

    <title>SIS</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

    <!-- HTML5  and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>


<body id="body">
<script type="text/javascript">
		$(document).ready(	  
		  /* This is the function that will get executed after the DOM is fully loaded */
		  function () 
		  {			  
		    $( "#Issued_Date").datepicker({  	dateFormat: 'dd/mm/yy'	});
		  }	
		);
	</script>
	
<%-- 	<script type="text/javascript">
		$(document).ready(	  
		  /* This is the function that will get executed after the DOM is fully loaded */
		  function () 
		  {			  
		    $( "#Return_Date").datepicker({  	dateFormat: 'dd/mm/yy'	});
		  }	
		);
	</script> --%>

	<div id="wrapper">

		<%@include file="/sidebar.jsp" %>
		

		<div id="page-content-wrapper">
			<div class="container-fluid" align="center">
				<form class="form-horizontal"  method="post" action="library">
					<div class="form-group">
						<label class="col-sm-2 control-label">Enter Student ID:</label>
						<div class="col-sm-3 ">
							<s:textfield name="S_ID"
								placeholder="Enter Student ID" id="S_ID" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Book ID:</label>
						<div class="col-sm-3">
							<s:textfield name="BOOK_ID"
								placeholder="Enter Book ID" id="BOOK_ID" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Book Name:</label>
						<div class="col-sm-3">
							<s:textfield name="Book_name"
								placeholder="Enter Book Name" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Issue Date:</label>
						<div class="col-sm-3">
							<s:textfield name="Issued_Date"
								placeholder="Enter Issue Date" ></s:textfield>
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Return Date:</label>
						<div class="col-sm-3">
						<s:textfield name="Return_Date" placeholder="Enter Return Date" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Fine Overdue:</label>
						<div class="col-sm-3">
							<s:textfield name="Fine"
								placeholder="Enter Fine amount" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-3">
							<button type="submit" class="btn btn-default" onclick="save()">Submit</button>
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
<!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>