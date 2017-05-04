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
<p>订单表</p>
	<form action="<%=basePath%>Repair/UserAddRepairOrder" method="post">
	选择问题类型:<input type="text" name="type" /><br/>
	问题描述:<input type="text" name="description"/><br/>
	选择图片:<input type="text" name="picture"/><br/>
	报修时间:<input type="text" name="date"/><br/>
	期望上门维修时间:<input type="text" name="expectedTime" ><br/>
	姓名:<input type="text" name="name"/><br/>
	电话:<input type="text" name="telephone"/><br/>
	地址:<input type="text" name="address"/><br/>
		<input type="submit" value="提交">
	</form>
	
</body>
</html>