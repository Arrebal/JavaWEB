<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h>查找书籍</h>
    <div class="content">
        <div class="main">
        <a href="reader.jsp">返回主页面</a>
        <br><br>
        <form name="form" action="Servlet?method=searchBook" method="post" ">
            <a>书名</a>&nbsp;&nbsp;<input type="text" name="bname" />
            <br><br>
            <a>作者名</a>&nbsp;&nbsp;<input type="text" name="wname" />
            <br><br>
            
            <input type="submit" value="查找" /></td>
        </form>
        </div>
    </div>
</body>
</html>