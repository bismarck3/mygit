<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.wj.entity.Technician,java.util.*"%>
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

<table border="1" >
		<tr>
			<th colspan="10">技师表</th>
		</tr>
		
		<tr>
			<th>技师ID</th>
			<th>技师名字</th>
			<th>技师电话</th>
		</tr>
		<%
			if(request.getAttribute("technicianList")!=null){
			List<Technician> technicianList=(List<Technician>)request.getAttribute("technicianList");
			for(Technician tech:technicianList){
		%>
		<tr>
			<td><%=tech.getId()%></td>
			<td><%=tech.getUsername()%></td>
			<td><%=tech.getTelephone()%></td>
		</tr>
		
		<%	}
			} %>
	</table>
	<hr/>
	<a href="<%=basePath%>login.jsp">跳转回login.jsp</a>
</body>
</html>