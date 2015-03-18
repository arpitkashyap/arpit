<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
 <head>
    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   

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

    <div id="wrapper">

             <%@include file="/Studentsidebar.jsp" %>

       <form class="form-horizontal" method="post">
 <div  style="width:1600px; float:center;">
  <div class="form-group">
	<div class="row">
	<label for="semester" class="col-sm-2 control-label">SEMESTER</label>
	<div class="col-sm-3">
	 <s:textfield  value="%{us.SEMESTER}" class="form-control" id="semester"/>
	
	</div>
 </div>
 </div>
 
  <div class="form-group">
	<div class="row">
	<label for="total_fee" class="col-sm-2 control-label">TOTAL FEE</label>
	<div class="col-sm-3">
	 <s:textfield  value="%{us.TOTAL_FEE}" class="form-control" id="total_fee"/>
	
	</div>
 </div>
 </div>
 <div class="form-group">
	<div class="row">
	<label for="fee_paid" class="col-sm-2 control-label">FEE PAID</label>
	<div class="col-sm-3">
	 <s:textfield  value="%{us.FEE_PAID}" class="form-control" id="fee_paid"/>
	
	</div>
 </div>
 </div>
 <div class="form-group">
	<div class="row">
	<label for="total_fee" class="col-sm-2 control-label">PAY DATE</label>
	<div class="col-sm-3">
	 <s:textfield  value="%{us.PAY_DATE}" class="form-control" id="pay_date"/>
	
	</div>
 </div>
 </div>
</div>
</form>
       
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>