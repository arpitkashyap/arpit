<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="s" uri="/struts-tags" %>
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

        <!-- /#sidebar-wrapper -->

        
        
        
          <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
            
            


<s:form class="form-horizontal" method="post" action="EditStudent">
<div  style="width:1600px; float:center;">
</div>
<div class="form-group">
	<h3 align="center">Enter Enroll Number of Student</h3>
	<div class="col-sm-3 ">
	<s:select headerKey="-1" cssClass="Stu" list="list" name="sid"  />
	</div>
</div>

<div class="form-group">

	<div class="col-sm-offset-2 col-sm-3">
	
		<s:submit  value="Edit Student" class="btn btn-default" />
	</div>
</div>
</s:form>

<br>
<br>
<br>
<s:form class="form-horizontal" method="post" action="EditFaculty">
<div class="form-group">
	<h3 align="center">Enroll Number of faculty:</h3>
	<div class="col-sm-3 ">
	<s:select headerKey="-1"  cssClass="Fac" list="list1" name="Faculty_Id"  />
	
	</div>
</div>
<div class="form-group">

	<div class="col-sm-offset-2 col-sm-3">
		<s:submit  value="Edit Faculty" class="btn btn-default" />
	</div>
</div>


</s:form>
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
