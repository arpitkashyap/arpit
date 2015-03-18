<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	
	<link rel="stylesheet"  href="bootstrap.css">
<link rel="stylesheet"  href="main.css">

<link rel="stylesheet" href="bootstrap-responsive.css">
                            
      </head>
      
 <body id="body">

    <div id="wrapper">
   <%@include file="/sidebar.jsp" %>
        </div>
<s:form action="">
<table>
  

  <tr>
   
    <td><s:textfield label="Roll Number" key="RollNumber" /></td>
    
    <td><s:textfield  label="Email" key="Email" size="10%"/></td>
    
  </tr>
  
  <tr>
    
    <td><s:textfield label="First Name" key="F_Name" size="10%"/></td>
    
    <td><s:textfield label="Phone" key = "Phone" size="10%" /></td>
  </tr>

	<tr>
	
		<td><s:textfield label="Last Name" key="L_Name" size="10%" cssStyle="color: #ffff;" /></td>
		
		<td><s:textfield label="Address" key="Address" size="10%" /></td>
		</tr>
	<tr>
		
		<td><s:textfield label="Date of Birth" key="DOB" size="10%"/></td>
		
		<td><s:textfield label="Password" key="PassWord"/></td>
	</tr>
	
	</table>
		<br>
		
		<s:submit value="Save Change" action="UpdateStudent" class = "btn btn-primary"/>
		<br>
		
		
		<s:submit value="Delete Student" action="DeleteStudent" class="btn btn-primary"/>
		</s:form>
		
		
		
		</h3>
<br>
<br>


</body>
</html>