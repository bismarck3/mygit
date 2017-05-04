<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.wj.entity.RepairOrder,com.wj.entity.Technician,java.util.*"%>
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
			if(request.getAttribute("repairOrderList")!=null){
			List<RepairOrder> repairOrderList=(List<RepairOrder>)request.getAttribute("repairOrderList");
			for(RepairOrder order:repairOrderList){
		%>
		<tr>
			<td><%=order.getId()%></td>
			<td><%=order.getType()%></td>
			<td><%=order.getDescription()%></td>
			<td><%=order.getPicture()%></td>
			<td><%=order.getDate()%></td>
			<td><%=order.getExpectedTime()%></td>
			<td><%=order.getName()%></td>
			<td><%=order.getTelephone()%></td>
			<td><%=order.getAddress()%></td>
			<td><%=order.getState()%></td>
			<td><a href="<%=basePath%>Repair/deleteRepairOrderById?id=<%=order.getId()%>">删除本条记录</a></td>
			<td><form action="<%=basePath%>Repair/ChangeRepairOrderStateById">
				<input type="hidden" name="id" value="<%=order.getId()%>"/>
				修改后状态:<input type="text" name="state"/>
				<input type="submit" value="修改订单状态"/>
				</form> 
			</td>
			<%
			if(request.getSession().getAttribute("technicianList")!=null){
				List<Technician> technicianList=(List<Technician>)request.getSession().getAttribute("technicianList");
			%>
			<td>			
				<select onchange="<%=basePath%>Technician/ChangeRepairOrderStateById">
				<option >请选择技师</option>
					<%
						for(Technician tech:technicianList){
					%>
					
					<option value="<%=tech.getId()%>">技师<%=tech.getId() %></option>
					<%} %>
				</select>
			</td>
			<%} %>
		</tr>
		
		<%	}
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