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
		    $( "#PAY_DATE").datepicker({  	dateFormat: 'dd/mm/yy'	});
		  }	
		);
	</script>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                     <a href="AdminHome.jsp">
                       Home
                    </a>
                </li>
                <li>
                    <a href="First.jsp">Register</a>
                </li>
                <li>
                    <a href="GetDetail">Modify</a>
                </li>
                <li>
                    <a href="AddNews.jsp">News</a>
                </li>
                <li>
                    <a href="AddAnnouncement.jsp">Announcement</a>
                </li>
                <li>
                    <a href="AddSubject.jsp">Add Subject</a>
                </li>
                <li>
                    <a href="UpdateGrades.jsp">Update Grades</a>
                </li>
                <li>
                    <a href="AssignSubjectFaculty.jsp">Assign Faculty Subjects</a>
                </li>
                   <li>
                    <a href="AssignSubjectStudent.jsp">Assign Student Subjects</a>
                </li>
                 <li>
                    <a href="LibraryAdmin.jsp">Library</a>
                </li>
                 <li>
                    <a href="FinancialInsert.jsp">Financial</a>
                </li>
                 <li>
                    <a href="Contact.jsp">Contact</a>
                </li>
                
                <li>
                    <a href="logout">Logout</a>
                </li>
           
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->


        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>Student Information System</h1>
                        
                    </div>
                </div>
            </div>
     <div>       <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Menu</a>
       


</div>
<form action ="FinancialInsert">
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      STUDENT ID:</div>
    <div class="col-md-3"> <input type="text" name="s_id"/>
	
</div>
</div>
</div>
<div class="form-group">
   <div class="row">
      <div class="col-md-3">
TOTAL FEE</div>
      <div class="col-md-3"> <input type="text" name="TOTAL_FEE"/>
	

</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      FEE PAID:</div>
    <div class="col-md-3"> <input type="text" name="FEE_PAID"/>
	
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      PAY DATE:</div>
    <div class="col-md-3">
    <s:textfield name ="PAY_DATE" ></s:textfield>	
</div>
</div>
</div>
<div class="form-group">
<div class="row">
      <div class="col-md-3">
      SEMESTER</div>
     <div class="col-md-3"> <input type="text" name="SEMESTER"/>
	
</div>
</div>
</div>


<div class="form-group">
<div class="row">
   
     
    <div class="col-md-3"><button type="submit" class="btn btn-default">SUBMIT</button>
</div>
</div>
</div>

</form>
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
