<!DOCTYPE html>
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

   
<img src= <s:property value="destpath"/> id="destpath" height="200px" width="200px">
<br><br><br><br><br><br><br><br>
<s:property value= "fname"/> 
<div id="footer " >
			<div class="col-sm-6"align="right">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">News</h3>
					</div>
					<div class="panel-body">
						<marquee direction="up" style="height: 110px"
							onmouseover="this.stop();" onmouseout="this.start();">
							<s:iterator value="news">
								<s:param><s:property value="newsHeading"/></s:param>
								<s:property value="newsHeading"/>
       						<br>
       						<br>
      							</s:iterator>
						</marquee>
					</div>
				</div>
			</div>
			
			
	<div class="col-sm-6"align="right">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Announcement</h3>
					</div>
					<div class="panel-body">
						<marquee direction="up" style="height: 110px"
							onmouseover="this.stop();" onmouseout="this.start();">
							<s:iterator value="ann" >
					<s:param><s:property value="announcementHeading"/></s:param>
					
					<s:property value="announcementHeading"/>
       						<br>
       						<br>
      							</s:iterator>
						</marquee>
					</div>
				</div>
			</div>
			

			
		</div>


    </div>
</body>

</html>