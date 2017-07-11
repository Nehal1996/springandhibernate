<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="edit.html" method="get">
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

			<c:forEach items="${sessionScope.list}" var="t">
<input type="hidden" name="id" value="${t.id }">
First Name <input type="text" name="fn" value="${t.fn}" /><br>
Last Name <input type="text" name="ln"  value="${t.ln}"/><br>
Middle Name <input type="text" name="mn"  value="${t.mn}"/><br>

</c:forEach>

<input type="submit" />
</form>

</body>
</html>