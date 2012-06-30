<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index page</title>
</head>
<body>
<s:form action="validateUser" namespace="/user">

	<s:textfield key="global.username" name="username" />
	<s:password key="global.password" name="password" />	
	<s:submit key="global.submit" name="submit" />
	
</s:form>
<a href="user/Register.jsp">Register</a>
</body>
</html>