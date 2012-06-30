<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>



</head>
<body>
<%-- <h3><s:text name="global.register" /></h3> --%>

<s:form action="validateRegister" namespace="/user">
	<s:textfield key="global.firstName" name="firstName"/>
	<s:textfield key="global.lastName" name="lastName"/>
	<s:textfield key="global.email" name="email"/>
	<s:textfield key="global.reEmail" name="reEmail"/>
	<s:password key="global.password" name="password"/>
<!-- 	<table><tr><td> -->
	<s:submit key="global.signUp"/>
<!-- 	</td></tr></table> -->
	
</s:form>

</body>
</html>