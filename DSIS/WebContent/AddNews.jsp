<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

<body>

    <div id="wrapper">

      <%@include file="/sidebar.jsp" %>
        
    
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

<form class="form-horizontal"  action="addNews">
<div class="form-group">

	<label for="newHeading" class="col-sm-2 control-label">ENTER NEWS HEADING </label>
	<div class="col-sm-3">
		<input type="text" class="form-control" name="newsHeading" placeholder="Enter News Heading" size ="50"/>
	</div>
</div>

<div class="form-group">
	<label for="newsDescription" class="col-sm-2 control-label">ENTER DESCRIPTION </label>
	<div class="col-sm-3">
	<textarea rows="4" cols="50" class="form-control" name="newsDescription" placeholder="Enter Description Here"></textarea>
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
 <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
 
</body>

</html>
