<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>管理员系统 - 添加档口</title>
    <!-- 引入样式文件和其他资源 -->
    <!--是排版-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/bootstrap.min.css'/>">
    <!--是颜色-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/style.css'/>">
    <!--又是排版-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/style-responsive.css'/>">
    <!--给图片的-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/1.css'/>">

</head>
<body>
<div>
    <!-- 标题 -->
    <h1>食堂评分 - 添加档口</h1>
    <!-- 添加档口表单 -->
    <form action="#" method="post" enctype="multipart/form-data">
        <div>
            <label for="canteen">所属食堂：</label>
            <input type="text" id="canteen" name="canteen" />
        </div>
        <div>
            <label for="name">档口名称：</label>
            <input type="text" id="name" name="name" />
        </div>
        <div>
            <label for="image">档口图片：</label>
            <input type="file" id="image" name="image" accept="image/gif, image/jpeg, image/png, image/jpg" />
        </div>
        <input type="submit" value="添加" />
        <input type="reset" value="重置" />
    </form>
    <!-- 返回上一页链接 -->
    <a href="<c:url value='/admin_foodstall'/>">返回上一页</a>
</div>
</body>
</html>
