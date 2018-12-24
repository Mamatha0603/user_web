<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Contact Information</h2>
<body>
<form:form method="post" modelAttribute="contactInfoBean" action="addcontact.do">
      <table>
          <tr>
              <td>Address:</td>
              <td><form:input path="address" /></td>
          </tr>
          <tr>
              <td>City:</td>
              <td><form:input path="city" /></td>
          </tr>
          
          <tr>
              <td>State:</td>
              <td><form:input path="state" /></td>
          </tr>
          
          <tr>
              <td>Country:</td>
              <td><form:input path="country" /></td>
          </tr>
          <tr>
              <td>Phone:</td>
              <td><form:input path="phone" /></td>
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