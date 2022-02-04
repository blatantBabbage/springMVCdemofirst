<%--
  Created by IntelliJ IDEA.
  User: snnites
  Date: 31/12/21
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student confirmation page</title>
</head>
<body>

The Student is confirmed : ${student.firstName} ${student.lastName}
<br><br>
Country : ${student.country}

<br><br>
Favourite Language : ${student.favouriteLanguage}

<br><br>

Operating Systems :
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>
