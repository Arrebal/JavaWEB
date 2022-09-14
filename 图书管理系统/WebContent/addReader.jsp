<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生信息</title>
<script>
</script>
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
  <table align="center" border="0px" cellpadding="10px" cellspacing="10px">
  <form action="Servlet?method=addReader"  method="post"  onsubmit="return check()">
  <tr>
  <td><a href="guanli.jsp">返回菜单</a></td>
  </tr>
   <tr>
    <td>学号:</td>
    <td><input type="text" name="xuehao" id="xuehao"></td>
   </tr>
   <tr>
   <td>读者姓名：</td>
   <td><input type="text" name="rname" id="rname"></td>
   </tr>
   <tr>
   <td>读者性别</td>
   <td>
   <select name="sex">
   <option value="男">男</option>
   <option value="女">女</option>
    </select>
   </td>
   </tr>
   
   <tr>
   <td>学生学院：</td>
   <td><input type="text" name="xueyuan" id="xueyuan"></td>
   </tr>
   <tr>
   
 
    <tr align="center">
    <th colspan="2">
    <input type="submit" value="提交">
    </th>
    </tr>
    </form>
</table>
</body>
</html>