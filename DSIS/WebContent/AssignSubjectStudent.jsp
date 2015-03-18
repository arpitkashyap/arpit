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
	
       
          <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
            
            


<s:form class="form-horizontal" method="post" action="AssignSubjecttoStudent">
<div  style="width:1600px; float:center;">
</div>
<div class="form-group">
	<div class="col-offset-3-sm-3 ">
	<s:select headerKey="-1" cssClass="Stu" list="list" name="S_Id" label="Select Student" />
	</div>
</div>

<div class="form-group">
	
	<div class="col-offset-3-sm-3 ">
		<div><s:select headerKey="-1" cssClass="Stu" list="list1" name="Subject_Id"  label="Select Subject" /></div>
		
	</div>
</div>
<div class="form-group">

	<div class="col-sm-offset-2 col-sm-3">
		<s:submit  value="Assign Subject" class="btn btn-default" />
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

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
    

</body>

</html>
