<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>User Data</title>
</head>
<body>
    <h1 style="color: aquamarine;">DISPLAY ALL USER DETAILS</h1>
<table border="1">
<tr>
    <th>PID</th>
    <th>NAME</th>
    <th>MOBILE NUMBER</th>
    <th>PNAME</th>
    <th>PRICE</th>
    <th>QUANTITY</th>
    <th>TOTAL</th>
    <th>DISCOUNT</th>
    <th>GST</th>
    <th>INVOICE_BILL</th>
    <th>DELETE</th>
    <th>EDIT</th>
</tr>

    <c:forEach var="product" items="${products}">  
     <tr>
<td>${product.pid}</td>
<td>${product.name}</td>
<td>${product.mobile_no}</td>
<td>${product.pname}</td>
<td>${product.price}</td>
<td>${product.quantity}</td>
<td>${product.total}</td>
<td>${product.discount}</td>
<td>${product.gst}</td>
<td>${product.invoice_bill}</td>
<td><a href="/delete/${product.pid}">Delete</a></td>
<td><a href="/edit/${product.pid}">Edit</a></td>
     </tr>       
    </c:forEach>
</table>
</body>
</html>