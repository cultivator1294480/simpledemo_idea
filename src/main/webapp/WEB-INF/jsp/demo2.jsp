<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/2 0002
  Time: 下午 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
    <title>test ssm  sessionAccount</title>
</head>
<body>
<h1>1111</h1>
<h2>sessionAccountList:${sessionAccountList}</h2>
<div>
    <c:forEach items="${sessionAccountList}" var="sessionAccount" varStatus="status">
        ${sessionAccount.name}
    </c:forEach>

</div>


</body>
</html>
