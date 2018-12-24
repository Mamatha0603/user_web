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
<form:form method="post" action="sendemail.do">
<table>
<tr>
<td>Name:</td>
<td><input  value="${loginBean.name }" /></td>
</tr>
<tr>
<td>email:</td>
<td><input  value="${loginBean.email}" /></td>

</tr>
 <tr>
              <td colspan="2">
                  <input type="submit" value="Send emailActivation" />
              </td>
          </tr>

</table>

</form:form>


<%-- <p>Login page successfully created...<br>
<b>Name:</b>:${loginBean.name}<br>
<b>email:</b>:${loginBean.email}<br><a href="jsp/sendemail.jsp">send activation eamil</a>
<b>DOB:</b>:${loginBean.dob}<br>
<b>Password</b>:${loginBean.password}<br> --%>



</body>
</html>