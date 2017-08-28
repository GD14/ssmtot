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
        function deleteItems() {

            document.itemsForm.action="${pageContext.request.contextPath}/item//deleteItems";
            document.itemsForm.submit();
        }
        function queryItem() {

            document.itemsForm.action="${pageContext.request.contextPath}/item/listItem";
            document.itemsForm.submit();
        }
    </script>
</head>
<body>

查询条件
<form name="itemsForm" action="${pageContext.request.contextPath}/item/listItem" method="post">
    <table width="100" border="1">
        <tr>
            <td>商品名称<input type="text" name="itemCustom.name"/></td>
            <td><input type="button" value="查询" onclick="queryItem()"></td>
            <td><input type="button" value="删除" onclick="deleteItems()"></td>
        </tr>

    </table>

    <table width="100" border="1">
        <tr>
            <td>chose</td>
            <td>name</td>
            <td>price</td>
            <td>opt</td>
        </tr>
        <c:forEach items="${itemList}" var="item">
            <tr>
                <td><input type="checkbox" name="ids" value="${item.id}"/></td>
                <td>${item.name}</td>
                <td>${item.price}</td>
                <td><a href="${pageContext.request.contextPath}/item/editItem?id=${item.id}">edit</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
