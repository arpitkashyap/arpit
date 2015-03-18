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

<form action="selectsubject"><h4>Course Catalog</h4>
 <div class="form-group">
   <div class="row">
  
   <div class="col-md-3">
     
       <label>SEMESTER</label>
       </div>
   </div>
    <div class="row">
     
      <div class="col-md-3">
      <select name="Semlist" class="form-control"  STYLE="width: 200px">
        <option value="1">Sem 1</option>
        <option value="2">Sem 2</option>
        <option value="3">Sem 3</option>
        <option value="3">Sem 4</option>
        
      </select></div>
      
      <div class="col-md-4">
      <input type="submit"  class="btn btn-primary" value=" submit "></div>
      </div>
      </div>
      </form>
      <s:iterator value="sub">
	 <s:url id="url" action="output">
	</s:url>
	<div class="form-group">
	<table>
	<tr>
	<td>
	<s:set name="webFramework" value="valid"/>
	<s:if test="%{#webFramework=='true'}">
	<s:a href="%{url}"><s:property/></s:a></td>
	</s:if>
	<s:else>
	<script type="text/javascript">
	alert("You are not yet registered for this sem");
</script>
	</s:else>
		<td></td>
		</tr>
	</table>
</div>
<%-- <s:set name="webFramework" value="list"/>
<s:if test="%{#webFramework=='false'}">
<script type="text/javascript">
alert("You are not yet registered for this sem");
</script>
</s:if> --%>
</s:iterator>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script></div></div>
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