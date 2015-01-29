<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
b{color: blue;}  
</style>
<title>Add User </title>
</head>
<body>

   <h1><span style="background-color: #FFFFcc">Hello </span></h1>
	<h2>Add User</h2><b>
   	<s:form  action="user" method="addUser">
  		<s:textfield name="userName" key="user.name" />
  		<s:textfield name="userAge" key="user.age" value=""/>
  		<s:radio name="userGender" key="user.gender" list="{'Male','Female'}" />
  		<s:select name="userJob"  key="user.job" list="%{#{'Software':'Software','Hardware':'Hardware','Networking':'Networking','Marketing':'Marketing'}}"/>  
  		<s:checkboxlist name="userHobbies" key="user.hobby" list="{'Swimming','Football','Drawing','Cooking','Driving','Movie'}" />  
  		<s:submit key="submit" align="center"/>
	</s:form>
	</b>
</body>
</html>