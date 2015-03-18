 
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
   <div class="container">
          <h5>FRIEND</h5>
          <form action="searchfrnd">
  <div class="form-group">
   <div class="row">
   <div class="col-md-3"></div><div class="col-md-3"></div><div class="col-md-3">
            <input type="text"   placeholder="Search" name="srch_frnd">
            
                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
         </div>
         </div>
         </div>
        </form>
    <br>    
<form class="form-horizontal"  action="showfriend">
  
     Friend List:
	<div class="form-group">
   <div class="row">
   <div class="col-md-3">
  
	<select class="form-control" id="selectfrnd" name="selectfrnd" > 
	    <s:iterator value="fname" >
    <option value= "<s:property value="friend_id"/>">  <s:property value="friend_name" /> </option>
     </s:iterator> 
        </select>
       </div>
       
        <div class="col-md-3">
      <button type="Submit" class="btn btn-primary">Show Detail</button> 
      </div>  
      </div>
        </div>
   
   </form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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

        