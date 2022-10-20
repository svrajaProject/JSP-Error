<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JLSDf</h1>

<c:forEach var="customers" items="${customers}" varStatus="c">
	<p>${customers.firstName}</p>
</c:forEach>
</body>
</html>