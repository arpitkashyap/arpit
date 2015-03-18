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
    <style type="text/css">
    .Sub{
    	position: relative;
    	left: -40%;
    	top: -75px;
    	size: 1000px;
    	width: 6.5cm;
    	height: 1.0cm;
    	
    	
    }
    </style>

</head>

<body id="body">

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
                    <a href="Addannouncement.jsp">announcement</a>
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
                    <a href="Contact.jsp">Contact</a>
                </li>
                 <li>
                    <a href="FinancialInsert.jsp">Financial</a>
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
            <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Menu</a>
		<div class="form-inline">
	
			<a href = "GetDetail.jsp" class="btn btn-default">Back</a>
            
        </div>

        </div>
        <!-- /#page-content-wrapper -->
        
          <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
            
            <s:form class="form-horizontal"  method="post" action="">
<div  style="width:1600px; float:center;">
<div class="form-group" >
	<label for="inputEmail3" class="col-sm-2 control-label">Enrollment Number:</label>
	<div class="col-sm-2 ">
		<input type="text" class="form-control" readonly="readonly" name="Faculty_Id" value = <s:property value = "Faculty_Id"/> >
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Password:</label>
	<div class="col-sm-2">
		<input type="text" class="form-control" required="required" name="Password" value = <s:property value = "Password"/> >
	</div>
</div>

<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Name:</label>
	<div class="col-sm-2">
		<input type="text" class="form-control" required="required" name="Faculty_Name" value = <s:property value = "Faculty_Name"/> >
	</div>
</div>



<div class="form-group">
	<label for="inputPassword3" class="col-sm-2 control-label">Email:</label>
	<div class="col-sm-2">
		<input type="email" class="form-control" required="required" name="Email" value = <s:property value = "Email"/> >
	</div>
</div>


<div class="form-group" >
	<label for="inputEmail3" class="col-sm-2 control-label"> Subject:</label>
	<div class="col-offset-2-sm-2 ">
<s:select headerKey="-1" headerValue="Subjects" cssClass="Sub" list="Faculty_list" name="Subject_Name" listValue="Subject_Name" />
	</div>
</div>

</div>

  
<div class="form-group">
	<div class="col-sm-offset-2 col-sm-3">
		<s:submit value="Save Changes" class="btn btn-default" action="UpdateFaculty" />
		<br>
		<s:submit value="Delete Faculty" action="DeleteFaculty" class="btn btn-default"/>
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
