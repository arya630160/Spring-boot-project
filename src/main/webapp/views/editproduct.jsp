<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>edit Product Form</title>
</head>

<body>
	<h2>PRODUCT EDIT FORM</h2>

	<form:form method="POST" action="/editandsave">
		<table>
            <tr>
				<td>PID:</td>
				<td><form:hidden path="pid" /></td>
            </tr>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
            <tr>
				<td>Mobile Number:</td>
				<td><form:input path="mobile_no" /></td>
			</tr>
            <tr>
				<td>Product Name:</td>
				<td><form:input path="pname" /></td>
			</tr>
            <tr>
				<td>Price:</td>
				<td><form:input path="price" /></td>
			</tr>
            <tr>
				<td>Quantity:</td>
				<td><form:input path="quantity" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="EditAndSave"></td>
			</tr>
			<tr>
		</table>
	</form:form>

</body>
</html>