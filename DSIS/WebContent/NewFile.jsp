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

<body>

    <div id="wrapper">

      <%@include file="/sidebar.jsp" %>
        
    
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>


 <div class="form-group">
        <div class="col-lg-8">
        <H3>name:Arpit Kashyap</H3>                                               
          </div>
          <div class="col-lg-4">
          <H3>roll no:MT2014015</H3>
          </div>
          </div>
<form class="form-horizontal"  action="formtestInterest">
<div class="form-group">

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
		<button type="submit" class="btn btn-default">submit</button>
	</div>
	</div>
</div>
</form>


<div class="form-group">
<div class="container">
<div class="col-lg-8">
        <H3>Details of student having interest= <s:property value="Interest"/></H3>                                               
          </div>
        
<table class="table" >
    <thead>
      <tr>
        <th class="Srno">Srno</th>
        <th class="Sid">Student Id </th>
        <th class="Fname">Student name</th>
		<th class="Photo">Photo </th>
		<th class="Semester">Semester no</th>
		
<th>             </th>
		<th></th>
      </tr>
    </thead>
    <%int i=1; %>
    <s:iterator value="arr_test">
   <tr>
        <th class="Srno"><%=i%></th>
        <th class="Sid"><s:property value="sid"/></th>
        <th class="Fname"> <s:property value="fname"/></th>
		<th class="Photo"> <img src= <s:property value="destpath"/> id="destpath" height="200px" width="200px"></th>
		<th class="Semester"> <s:property value="Semester"/></th>
      <% i++;%>
      </tr></s:iterator>
    </table>
  </div>
  </div>
</div>
 <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
 
</body>

</html>


</body>
</html>