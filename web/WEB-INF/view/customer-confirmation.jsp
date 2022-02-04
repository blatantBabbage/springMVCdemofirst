<%--
  Created by IntelliJ IDEA.
  User: snnites
  Date: 01/01/22
  Time: 3:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation page</title>
</head>
<body>
The Customer is : ${customer.firstName} ${customer.lastName}
<br><br>
Free passes: ${customer.freePasses}
<br><br>
Postal Code : ${customer.postalCode}
<br><br>
Course Code : ${customer.courseCode}
</body>
</html>
