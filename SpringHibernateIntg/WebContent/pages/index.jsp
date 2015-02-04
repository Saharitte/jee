<%@ page language="java" contentType="text/html; charset=UTF-8"
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
	<div id="contain">



		<div id="head">



			<s:url action="locale" id="langueFr">
				<s:param name="request_locale">fr</s:param>
			</s:url>

			<s:url action="locale" id="langueAng">
				<s:param name="request_locale">en</s:param>
			</s:url>


			<s:a href="%{langueFr}">
				<IMG SRC="../images/pngfr.jpg" border="0"></IMG>
			</s:a>
			<s:a href="%{langueAng}">
				<IMG SRC="../images/pngang.jpg" border="0"></IMG>
			</s:a>
			
			<s:form action="addPersonMethod" method="addPersonMethod">

				<s:hidden name="id" />
				<s:textfield name="name" key="person.nom" />
				<s:textfield name="country" key="person.Pays" />
				<s:submit key="submit" align="center" />
			</s:form>
		</div>




		<s:form action="listPersonMethod" method="post" namespace="/">
			<s:submit value="List" />
		</s:form>

		<table border="2" width="700px">
			<tr>
				<th>Name</th>

				<th>Country</th>

				<th>delete</th>
				<th>Edit</th>


			</tr>
			<s:iterator value="%{persons}">
				<tr>
					<td><s:property value="name" /></td>
					<td><s:property value="country" /></td>



					<td><s:url id="deleteURL" action="deletePersonMethod">
							<s:param name="id" value="%{id}"></s:param>
						</s:url> <s:a href="%{deleteURL}">Delete</s:a> .</td>

					<td><s:url id="editURL" action="editPersonMethod">
							<s:param name="id" value="%{id}"></s:param>
						</s:url> <s:a href="%{editURL}">edit</s:a> .</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>


</body>
</html>
