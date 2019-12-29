<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <meta charset="UTF-8">
<title>Insert title here</title>
  <body>
    <table border="1" style="width: 80%">
		<tr>
			<th>用户名</th>
			<th>密码</th>
			<th>Email</th>
			<th>信息</th>
		</tr>
		<c:forEach items="${userList}" var="users">
			<tr>
				<td>${users.devName}</td>
				<td>${users.devPassword}</td>
				<td>${users.devEmail}</td>
				<td>${users.devInfo}</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
