<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%
          Object message = request.getAttribute("message");
          if(message!=null && !"".equals(message)){
      
     %>
          <script type="text/javascript">
               alert("<%=request.getAttribute("message")%>");
          </script>
     <%} %>
     <h>书籍信息</h>
    <div class="content">
        <div class="main">
        <a href="reader.jsp">返回主页</a>
        <table align="center">
            <tr>
                <th>唯一编号</th>
                <th>书名</th>
                <th>作者名</th>
                <th>出版社名称信息</th>
                <th>可借阅数量</th>
                
            <tr>
                <c:forEach items="${tens}" var="item">
                <tr>
                    <td><a href="CourseServlet?method=getbyname&&bname=${item.bname}"></a></td>
                    <td>${item.bianhao}</td>
                    <td>${item.bname}</td>
                    <td>${item.wname}</td>
                    <td>${item.bhome }</td>
                    <td>${item.num}</td>
                </tr>
                </c:forEach>
        </table>
    </div>
</body>
</html>