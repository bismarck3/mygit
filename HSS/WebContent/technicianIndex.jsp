<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>技师表</p>
	<form action="<%=basePath%>Technician/AddTechnician" method="post">
	姓名:<input type="text" name="username"/><br/>
	电话:<input type="text" name="telephone"/><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>