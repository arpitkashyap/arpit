<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
function save(){
	var id =  document.getElementById("1");
	var pass =  document.getElementById("2");
	var flag=1;
	if(id.value=="")
	{
		alert("Enrollement can not be blank....");
		flag=0;
		return false;
	}
	else if(pass.value=="" )
	{
		alert("Password can not be blank....");
		flag=0;
		return false;
	}
	else if(flag==1){
		return true;
	}
	
}
</script>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	
<link href="css/simple-sidebar.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
  


</head>
<body id="body">

<table align="center">
<tr>
<td>
<h2>STUDENT INFORMATION SYSTEM</h2>
</td>
</tr>					
</table>


     <div id="page-content-wrapper">
<div class="container" align="center">
	
		<div >
			<h3>Log in</h3>
		</div>
         	<div align="center" STYLE="width: 200px" >
		<form action="input" onSubmit="return save();">
  			<div class="form-group" >
  			<div class="row">
      <div class="col-md-4">
    				<label for="userid">Username</label></div>
    			    <div class="col-md-6">	<input type="text" class="form-control" name="userid" id="1">
  		</div>	</div>
  		</div>
  		
  		<div class="form-group">
   				<div class="row">
      <div class="col-md-4"> <label for="pwd">Password</label></div>
          <div class="col-md-6">	 <input type="password" class="form-control" name="pwd" id="2" >
  	</div>		</div>
  	</div>
  	<div class="form-group">
<div class="row">
      <div class="col-md-4">
  		<button type="submit" class="btn btn-primary" onClick="save()">Submit</button>
  	  </div> 
		</div>
		</div>
		</form>
			</div>
	  		
           </div> 			
</div>
</body>
</html>