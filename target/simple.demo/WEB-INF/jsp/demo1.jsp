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
    <title>test ssm</title>
</head>
<body>
sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
<h1>1111</h1>
<h2>accountservice:${accountList}</h2>
<div>
            fffffffffffffffffffffffffffffffffffffffffffffffff
    <c:forEach items="${accountList}" var="account" varStatus="status">
        ${account.name}
    </c:forEach>

    <a href="demo2">demo2</a>

</div>
<script type="application/javascript">

    //代码示例3
    //注意还是那个Add，精髓也在这里，随后说到
    function Add(a, b){
        return a+b;
    }
    //LazyAdd改变了，多了一个参数cb
    function LazyAdd(a, cb){
        return function(b){
            cb(a, b);
        }
    }
    //将Add传给形参cb
    var result = LazyAdd(1, Add)
    // doing something else
    result = result(2); // => 3
    console.log(result);
</script>

</body>
</html>
