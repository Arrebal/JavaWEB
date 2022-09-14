<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="a" class="entity.User"></jsp:useBean>
<jsp:useBean id="b" class="servlet.userServlet"></jsp:useBean>
<jsp:setProperty property="*" name="a"/>
<body>

<% 
  if(b.Hefa1(a))
  {
  
  %>
  <jsp:forward page="guanli.jsp"></jsp:forward>
  <%
  }
  else if(b.Hefa2(a))
{
session.setAttribute("user", a);
%>
<jsp:forward page="reader.jsp"></jsp:forward>
<%
}
  else{%>
  alert("用户名或密码错误！");
  <jsp:forward page="index.jsp"></jsp:forward>
  <% 
  }
%>
</body>
</html>