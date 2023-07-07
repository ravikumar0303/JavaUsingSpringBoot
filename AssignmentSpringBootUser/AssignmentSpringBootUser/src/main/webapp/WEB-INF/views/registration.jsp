<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form:form action="/insertuser" method="post" modelAttribute="myuser">
       User Id: <input path="uid" id="uid"/>
       User Name:<input path="uname" id="uname"/><br>     
       Address : <input path="qty" id="qty"/>
       Gender: <input path="gender" id="gender"/>
       City:<input path="city" id="city"/>
     <button type="submit" name="btn" id="btn" value="add">Registration</button>
  </form:form>

</body>
</html>