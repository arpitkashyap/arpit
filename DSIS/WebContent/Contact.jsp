<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
                      <ul class="sidebar-nav">
                <li class="sidebar-brand">
                <a href="AdminHome.jsp">
                       Home
                    </a>
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
                        
                        
                        
                        	<img src="image/address_icon.jpg"><p> 26/C, Electronics City, Hosur Road,</p>
							<p> Bengaluru, Karnataka 560100</p>
							<img src="image/call_icon.jpg"><p>	Phone: 080 4140 7777</p>
							<p> Founded: 1999</p>

                        
                    </div>
                </div>
            </div>
            <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Menu</a>
        </div>
        <!-- /#page-content-wrapper -->
        
          <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
            
            
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
