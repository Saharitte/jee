<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Login</title>
</head>
<body>
<h3>Struts 2 Hello World</h3>

<s:form action="login">
        <s:textfield name="userName" label="Username" />
        <s:submit value="Submit" />
</s:form>
</body>
</html>