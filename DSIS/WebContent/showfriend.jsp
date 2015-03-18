<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

<head>
<script src="js/jquery.js"></script>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   
 <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
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
        
  <div class="container">
  <h5>FRIEND</h5>
    <form action="delfrnd">
  <div class="form-group">
   <div class="row">
  
 <div class="col-md-3">
<img src= <s:property value="destpath"/> height="200px" width="200px">
</div>
</div>
</div>

<div class="form-group">Name:
   <div class="row">
   <div class="col-md-3">
   <input type="text" class="form-control" value="<s:property value="frndtry_name"/>"/>
   </div>
   </div>
   Address:
   <div class="row">
   <div class="col-md-3">
	<input type="text" class="form-control" value="<s:property value="frnd_Address"></s:property>"/>
   </div>
   </div>
   Phone No.:
   <div class="row">
   <div class="col-md-3">
  <input type="text" class="form-control" value="<s:property value="frnd_phone"></s:property>"/>
  </div>
 
    <div class="col-md-3">
     <button type="Submit" class="btn btn-primary">Remove Friend</button> </div> </div>
	</div>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </form>
    </div>
   </div>
   </div>                  
</body>
     <!-- /#page-content-wrapper -->

    
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
    
  
</html>