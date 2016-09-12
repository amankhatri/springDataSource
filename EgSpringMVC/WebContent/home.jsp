<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="controller.*,java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <title>Geek News</title>
      <link type="text/css" rel="stylesheet" href="css/geeknews.css" />
   </head>

<body>

<%@ include file="header.jsp" %>

<div id="mainContent">

<p><a href="post.htm">Post</a></p>

<c:forEach items="${articles}" var="article">

<div class="article">
<p><a href="article.htm?id=<c:out value="${article.id}"/>"><c:out value="${article.title}" /></a> 
   by <span class="articleAuthor"><c:out value="${article.author}" /></span>
   on <span class="articleDate"><fmt:formatDate value="${article.date}" type="both" /></span>
</p>

<p class="articleSummary"><c:out value="${article.summary}" /></p>
</div>

</c:forEach>

</div>


<%@ include file="footer.jsp" %>

</body>
</html>