
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		    $( "#dob").datepicker({  	dateFormat: 'dd/mm/yy'	});
		  }	
		);
	</script>
	

    <div id="wrapper">

              <%@include file="/Studentsidebar.jsp" %>
        
<form action ="UpdateStudentInfo">
<div class="form-group">
   <div class="row">
      <div class="col-md-3">
FIRST NAME:</div>
      <div class="col-md-3"><s:textfield name ="fname" value="%{student.fname}">
</s:textfield>
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      LAST NAME:</div>
    <div class="col-md-3"><s:textfield name ="lname" value="%{student.lname}">
</s:textfield>
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      EMAIL:</div>
    <div class="col-md-3"><s:textfield name ="email"  value="%{student.email}">
</s:textfield>
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      ADDRESS</div>
     <div class="col-md-3"><s:textfield name ="address" value="%{student.address}">
</s:textfield>
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      PHONE NO</div>
    <div class="col-md-3"> <s:textfield name ="phno" value="%{student.phno}">
</s:textfield>
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      DATE OF BIRTH</div>
<div class="col-md-3">
<s:textfield name ="dob" value="%{student.dob}"></s:textfield>
     </div>
</div>
</div>


<div class="form-group">
<div class="row">
  <div class="col-md-3">
      INTEREST</div>
      <div class="col-md-6">


	<s:checkboxlist  list="interestAll" 
	   name="intereststudent" />
	   
</div>
</div>




        </div>
     <div class="form-group">
<div class="row">
    <div class="col-md-3"><button type="submit" class="btn btn-default">UPDATE</button>
</div>
</div>

</div>
</form>     
</div>
   </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    
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
