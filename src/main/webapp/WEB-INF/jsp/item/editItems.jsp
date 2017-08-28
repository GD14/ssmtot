<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: GD14
  Date: 2017/8/26
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商品信息</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath}/item/editItemSubmit" method="post" >
    <input type="hidden" name="id" value="${itemCustom.id}">
    修改商品信息
    <table width="100%" border="1">
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="name" value="${itemCustom.name}"></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" name="price" value="${itemCustom.price}"/></td>
        </tr>
        <tr>
            <td>日期</td>
            <td>
                <input type="text" name="createTime"  value= "<fmt:formatDate value="${itemCustom.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/>
            </td>
        </tr>
        <tr>

            <td rowspan="2" align="center">
                <input type="submit" value="提交" align="center">
            </td>
        </tr>

    </table>

</form>

</body>
</html>
