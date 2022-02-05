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
