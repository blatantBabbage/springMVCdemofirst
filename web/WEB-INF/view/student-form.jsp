<%--
  Created by IntelliJ IDEA.
  User: snnites
  Date: 31/12/21
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First Name : <form:input path="firstName"/>
    <br><br>
    Last Name : <form:input path="lastName"/>
    <br><br>
    Country :
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    Favourite Language :
    <br><br>
    <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"/>
    <br><br>
    Operating Systems :
    <br><br>
    <form:checkboxes path="operatingSystems" items="${student.operatingSystemsOptions}"/>
    <br><br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
