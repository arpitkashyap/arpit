<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html >
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
        
        
        <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
 <div  style="width:1600px; float:center;">
    
<s:form action="search" >
<div class="form-group" >
<div class="row">

<div class ="col-md-2">
	<label >Enrollment:</label></div>
	<div class="col-sm-2">
		<input type="text" class="form-control" name="s_id" placeholder="ENTER ENROLLMENT NO." />
		</div></div>
		<div class="row"><div class="col-sm-2"></div>
		<div class="col-sm-2">
		
		<button type="submit" class="btn btn-default"> OK </button>
		</div></div>
	
</div>
</s:form>

<br>
<s:form class="form-horizontal" method="execute" action="update">

<div class="form-group">
<s:iterator value="subject">
<div class="row">

<div class ="col-md-2">
	<label > <s:property/></label>
</div>
<div class ="col-md-2">
	<input type="text"  class="form-control" name="marks"  placeholder="ENTER MARKS" />
		
</div>
</div>

</s:iterator>

	<div class ="row">
	<div class ="col-md-2"></div>
	<div class ="col-md-2">
		  <button type="submit" class="btn btn-default" >Submit</button>
	</div>
	</div>
</div >
</s:form>
</div>
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
