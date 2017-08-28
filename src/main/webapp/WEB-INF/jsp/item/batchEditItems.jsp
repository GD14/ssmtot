<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GD14
  Date: 2017/8/26
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
    </script>
</head>
<body>

批量修改
<form name="itemsForm" action="${pageContext.request.contextPath}/item/batchSubmit" method="post">
    <table width="100" border="1">
        <tr>
            <td><input type="submit" value="批量修改" /></td>
        </tr>
    </table>
    <table width="100" border="1">
        <tr>
            <td>name</td>
            <td>price</td>
        </tr>
        <c:forEach items="${itemList}" var="item" varStatus="status">
            <tr>
                <%--<td><input type="checkbox" name="ids" value="${item.id}"/></td>--%>
                <input type="hidden" name="customLists[${status.index}].id" value="${item.id}"/>
                <td><input type="text" name="customLists[${status.index}].name" value="${item.name}"/></td>
                <td><input type="text" name="customLists[${status.index}].price" value="${item.price}"/></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
