<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.wj.entity.RepairOrder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单信息</title>
</head>
<body>

	<table border="1" >
		<tr>
			<th colspan="10">订单表</th>
		</tr>
		
		<tr>
			<th>订单号</th>
			<th>选择问题类型</th>
			<th>问题描述</th>
			<th>选择图片</th>
			<th>报修时间</th>
			<th>期望上门维修时间</th>
			<th>姓名</th>
			<th>电话</th>
			<th>地址</th>
			<th>订单状态</th>
			<th>订单操作</th>
			<th>修改订单信息</th>
			<th>委派技师</th>
		</tr>
		<%
			if(request.getAttribute("order")!=null){
			RepairOrder repairOrder=(RepairOrder)request.getAttribute("order");
		%>
		<tr>
			<td><%=repairOrder.getId()%></td>
			<td><%=repairOrder.getType()%></td>
			<td><%=repairOrder.getDescription()%></td>
			<td><%=repairOrder.getPicture()%></td>
			<td><%=repairOrder.getDate()%></td>
			<td><%=repairOrder.getExpectedTime()%></td>
			<td><%=repairOrder.getName()%></td>
			<td><%=repairOrder.getTelephone()%></td>
			<td><%=repairOrder.getAddress()%></td>
			<td><%=repairOrder.getState()%></td>
		</tr>
		
		<%	
			} %>
	</table>
	<br/>
	<br/>
	<br/>
	<hr/>
	<hr/>
	<a href="<%=basePath%>login.jsp">跳转回login.jsp</a>
</body>
</html>