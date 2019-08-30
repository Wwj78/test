<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function del(id){
	if(confirm("是否删除?")){
		open("delete?id="+id,"_self");
	}
}
</script>
<form action="index">
<input name="txt"><input type="submit" value="查询">
</form>
<a href="add">新增</a>
<table>
<tr><td>编号</td><td>名称</td><td>性别</td><td>属性</td><td>操作</td></tr>
<c:forEach items="${list}" var="r">
<tr><td>${r.id}</td><td>${r.name }</td><td>${r.sexname }</td><td>${r.typename }</td><td>
<a href="edit?id=${r.id}">修改</a>
<a href="javascript:del(${r.id})">删除</a>
</td></tr>
</c:forEach>
</table>
</body>
</html>