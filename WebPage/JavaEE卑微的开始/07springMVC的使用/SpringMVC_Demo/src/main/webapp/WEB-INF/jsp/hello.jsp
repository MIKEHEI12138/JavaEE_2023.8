<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<div>
    <!-- 省略搜索框和添加档口链接部分 -->
    <table>
        <!-- 表头 -->
        <tr>
            <th>档口编号</th>
            <th>所属食堂</th>
            <th>档口名称</th>
            <th>图片展示</th>
            <th>评分人数</th>
            <th>平均分数</th>
            <th>操作</th>
        </tr>
        <!-- 使用 JSTL 遍历档口数据并展示 -->
        <c:forEach items="${foodStalls}" var="foodStall">
            <tr>
                <td>${foodStall.foodStallsID}</td>
                <td>${foodStall.canteen}</td>
                <td>${foodStall.name}</td>
                <td><img src="<c:url value='${foodStall.imagePath}'/>" alt="档口图片" width="50px" /></td>
                <td>${foodStall.numberOfRatings}</td>
                <td>${foodStall.averageRating}</td>
                <td>
                    <a href="#">删除</a>
                    <a href="#">修改信息</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
