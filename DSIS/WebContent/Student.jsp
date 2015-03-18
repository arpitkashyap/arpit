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
<style>
.image{
	text-align: right;

}
</style>
<style type="text/css">
    .Sub{
    	position: relative;
    	left: -29%;
    	top: -65px;
    	size: 1000px;
    	width: 6.5cm;
    	height: 1.0cm;
    	
    	
    }
    </style>


</head>

<body id="body">

    
    <div id="wrapper">

       <%@include file="/sidebar.jsp" %>
    
       
            
        
          <div id="page-content-wrapper">
            <div class="container-fluid" align="center">

<div align="right">
<img src= <s:property value="destpath"/> class="image" id="destpath" height="200px" width="200px">
</div>
            
            <s:form class="form-horizontal"  method="post" action="">
<div  style="width:1600px; float:center;">
<div class="form-group" >
	<label for="inputEmail3" class="col-sm-2 control-label"> Enrollment Number:</label>
	<div class="col-sm-2 ">
		<input type="text" class="form-control" name="sid" readonly="readonly" value = <s:property value = "sid"/> >
	</div>
</div>

<div class="form-group" >
	<label for="inputEmail3" class="col-sm-2 control-label"> First Name:</label>
	<div class="col-sm-2 ">
		<input type="text" class="form-control" name="fname" required="required" value = <s:property value = "fname"/> >
	</div>
</div>

<div class="form-group" >
	<label for="inputEmail3" class="col-sm-2 control-label"> Last Name:</label>
	<div class="col-sm-2 ">
		<input type="text" class="form-control" name="lname" value = <s:property value = "lname"/> >
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Password:</label>
	<div class="col-sm-2">
		<input type="text" class="form-control" name="Password" required="required" value = <s:property value = "Password"/> >
	</div>
</div>





<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Contact:</label>
	<div class="col-sm-2">
		<input type="text" class="form-control" required="required" name="Phno" value = <s:property value = "Phno"/> >
	</div>
</div>
<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Email:</label>
	<div class="col-sm-2">
		<input type="email" class="form-control" required="required" name="email" value = <s:property value = "email"/> >
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Address:</label>
	<div class="col-sm-2">
		<input type="text" class="form-control" required="required" name="address" value = <s:property value = "address" />>
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Semester:</label>
	<div class="col-sm-2">
		<input type="text" class="form-control" required="required" name="Semester" value = <s:property value = "Semester" />>
	</div>
</div>

<div class="form-group" >
	<label for="inputEmail3" class="col-sm-2 control-label"> Subject:</label>
	<div class="col-offset-2-sm-2 ">
<s:select headerKey="-1" headerValue="Subjects" cssClass="Sub" list="list" name="Subject_Name" listValue="Subject_Name" />
	</div>
</div>

	<!--<s:select label="What's your favor search engine" key="Subject_Name"
		headerKey="-1" headerValue="Select Search Engines"
		list="list" value="Subject_Name"
		 />-->


<div class="form-inline">
	<div class="col-sm-offset-2 col-sm-4">
		<s:submit value="Save Changes" key="SaveChange" class="btn btn-default" action="UpdateStudent" />
		<br>
		<s:submit value="Delete Student" key="DeleteStudent" action="DeleteStudent" class="btn btn-default"/>
	</div>
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

   
</body>

</html>
