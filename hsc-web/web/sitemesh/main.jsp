<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Halal Science Center - <decorator:title /></title>
<link rel="stylesheet" type="text/css" href="${contextPath}/assets/styles.css" />
</head>
<body>

<div class="header">
<img src="${contextPath}/images/1_01.jpg" />
<img src="${contextPath}/images/logo.png" />

</div>

<div class="tabs">
 <a href="">Register</a>
 <a href="">xxx</a>
</div>
<div class="tabs-under-bg"></div>
<div class="tabs-under">
  
</div>

<div class="bodyhead">
  <h2><decorator:title /></h2>
</div>
<div class="body">
<table>
<tr>
<td width="30"></td><td><decorator:body /></td>
</tr>
</table>

</div>


</body>
</html>