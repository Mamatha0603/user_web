<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="loginBean" action="addloginuser.do">
      <table>
          <tr>
              <td>Name:</td>
              <td><form:input path="name" /></td>
          </tr>
          <tr>
              <td>Email:</td>
              <td><form:input path="email" /></td>
          </tr>
          
          
          
          <tr>
              <td>DOB:</td>
              <td><form:input path="dob" /></td>
          </tr>
          <tr>
              <td>Password:</td>
              <td><form:password path="password"  /></td>
          </tr>
           <tr>
              <td>re-Password:</td>
              <td><form:password path="repassword"/> </td>
          </tr>
          
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>

</form:form>

</body>
</html>