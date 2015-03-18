 
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
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
        
     <div class"container">
    <h5>GRADE</h5>
  <label for="sel1">SEMESTER</label>
 <form action="GradeAction">
 <div class="form-group">
   <div class="row">
      <div class="col-md-3">
   <select class="form-control" name="semester" STYLE="width: 200px" > 
		
        <option value="1">sem1</option>
        <option value="2">sem2</option>
        <option value="3">sem3</option>
        <option value="4">sem4</option>
       
      </select> </div>
	
     <div class="col-md-2">
      
   
      <input type="Submit" class="btn btn-primary" name="Submit" value="Submit" >
   
    </div>
     
     </div>
     </div>
           
  <table class="table" >
    <thead>
      <tr>
        <th class="scode">Subject code </th>
        <th class="s_name">Subject Name </th>
        <th class="grade">Grade </th>
		<th class="result">Result </th>
		<th></th>
		<th></th>
      </tr>
    </thead>
    <s:iterator value="name">
    <s:set name="webFramework" value="valid"/> 
    <s:if test="%{#webFramework=='false'}">
     <script type="text/javascript">
     alert("You are not yet enrolled for this semester"); 
     </script> 
     </s:if>
  <tr> <th class="scode"> <s:property value="Subject_id"/></th>
        <th class="s_name"> <s:property value="Subject_name"/></th>
        <th class="grade"> <s:property value="Grade"/></th>
		<th class="result"> <s:property value="Result"/></th>
      </tr>
      </s:iterator>
    </table>



    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
   </form> </div></div></div>
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

