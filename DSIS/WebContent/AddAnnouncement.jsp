<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE struts PUBLIC
   "-//Apache Software Founsdation//DTD Struts Configuration 2.0//EN"
   "http://struts.apache.org/dtds/struts-2.0.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SIS</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

  
</head>

<body>

    <div id="wrapper">
        <%@include file="/sidebar.jsp" %>



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
<form class="form-horizontal"  action="addAnnouncement">
<div class="form-group">

	<label for="announcementHeading" class="col-sm-2 control-label">ENTER ANNOUNCEMENT HEADING </label>
	<div class="col-sm-3">
		<input type="text" class="form-control" name="announcementHeading" placeholder="Enter ANNOUNCEMENT Heading" size ="50"/>
	</div>
</div>

<div class="form-group">
	<label for="announcementDescription" class="col-sm-2 control-label">ENTER DESCRIPTION </label>
	<div class="col-sm-3">
	<textarea rows="4" cols="50" class="form-control" name="announcementDescription" required="required" placeholder="Enter Description Here"></textarea>
	</div>  
</div>
<div class="form-group">
	<label for="interest" class="col-sm-2 control-label">Interest </label>
	<div class="col-sm-3">
	<select name="interest" class="form-control"  STYLE="width: 200px">
        <s:iterator value="arr_interest">
							
						
        
        <option value="<s:property value="Interest"/>"><s:property value="Interest"/></option>
		
		</s:iterator>
      </select>
      </div>
      </div>
      


<div class="form-group">
	<div class="col-sm-offset-2 col-sm-3">
		<button type="submit" class="btn btn-default">ADD</button>
	</div>
	</div>
</form>
</div>

</body>

</html>