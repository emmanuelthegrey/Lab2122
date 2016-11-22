<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<html>
<head>
	<title>Order Process</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<p>Pizza: ${pizza }</p>
<p>Fruit:
<c:if test="${fn:length(fruits) == 0}">
you ordered no fruits
</c:if>
<c:if test="${fn:length(fruits) == 1}">
you ordered one fruit:
</c:if>
<c:if test="${fn:length(fruits)> 1}">
you ordered ${fn:length(fruits) } fruit:

</c:if>
<ol>
<c:forEach var= "fr" items = "${fruits}">
    <li>${fr }</li>
</c:forEach>
</ol>
</p>



</body>
</html>
