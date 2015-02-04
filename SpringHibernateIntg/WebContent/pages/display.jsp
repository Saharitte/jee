<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
b {
	color: blue;
}
</style>
<title>add</title>
</head>
<body>
<body>

		<div id="head">
			<s:form action="editPersonMethod" method="post">
				<s:textfield name="name" label="Nom" />
				<s:textfield name="country" label="Pays" />
				<s:submit key="submit" align="center"  />
			</s:form>
		</div>




</body>


</body>
</html>
