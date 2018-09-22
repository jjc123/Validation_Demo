<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>新鲜水果</h3>
<c:if test="${allErrors!=null }">
    <c:forEach items="${allErrors }" var="error">
        ${ error.defaultMessage}<br/>
    </c:forEach>
</c:if>
<table width="300px" border="1">
    <tr>
        <td>序号</td>
        <td>名称</td>
        <td>价格</td>
    </tr>
    <c:forEach items="${fruits}" var="fruit" varStatus="varfrt">
        <tr>
            <td>${varfrt.count}</td>
            <td>${fruit.name}</td>
            <td>${fruit.price}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
