<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

			<c:forEach items="${sessionScope.list}" var="t">
<table>
			
			<tr>
			<td>${t.id}</td>
			<td>${t.fn}</td>
			<td>${t.ln}</td>
			<td>${t.mn}</td>
			<td><a href="update.html?s1=${t.id}">Update</a></td>
			</tr>
</table>			
			</c:forEach>

</body>
</html>