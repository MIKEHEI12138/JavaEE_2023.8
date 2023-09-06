<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>管理员系统 - 档口信息表</title>
    <!-- 引入样式文件和其他资源 -->

</head>
<body>
<div>
    <!-- 标题和搜索框 -->
    <h1>食堂评分 - 档口信息表</h1>
    <form action="#" method="post">
        <input type="text" name="search" placeholder="搜索档口..." />
        <input type="submit" value="搜索" />
    </form>
    <!-- 添加档口链接 -->
    <a href="<c:url value='/fix_foodstall'/>">添加档口</a>
</div>
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
</body>
</html>
