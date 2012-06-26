<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="requestURI" value="${pageContext.request.requestURI}" />
<c:set var="isEvents" value="${fn:contains(requestURI, '/events/')}" />
<c:set var="isPeople" value="${fn:contains(requestURI, '/people/')}" />
<c:set var="isForms" value="${fn:contains(requestURI, '/forms/')}" />

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
  <h1>Halal Science Center</h1>
</div>

<div class="tabs">
  <a ${isEvents ? 'class="s"' : ''} href='${contextPath}/events/Listing.action'>Events</a>
  <a ${isPeople ? 'class="s"' : ''} href='${contextPath}/people/Listing.action'>People</a>
  <a ${isForms ? 'class="s"' : ''} href='${contextPath}/forms/Listing.action'>Form</a>
</div>
<div class="tabs-under-bg"></div>
<div class="tabs-under">
  <c:if test="${isEvents}">
    <a href="Listing.action">List of Events</a>
    |<a href="New.action">New Event</a>
  </c:if>
  <c:if test="${isPeople}">
    <a href="Listing.action">List of People</a>
    |<a href="New.action">New Person</a>
  </c:if>
  <c:if test="${isForms}">
    <a href="Listing.action">List of Form</a>
    |<a href="New.action">New Form</a>
  </c:if>
  &nbsp;
</div>

<div class="bodyhead">
  <h2><decorator:title /></h2>
</div>
<div class="body">
<decorator:body />
</div>



</div>
</body>
</html>