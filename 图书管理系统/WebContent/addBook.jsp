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
  <form action="Servlet?method=addBook"  method="post"  onsubmit="return check()">
  <tr>
  <td><a href="guanli.jsp">返回菜单</a></td>
  </tr>
   <tr>
    <td>图书编号:</td>
    <td><input type="text" name="bianhao" id="bianhao"></td>
   </tr>
   <tr>
   <td>书名：</td>
   <td><input type="text" name="bname" id="bname"></td>
   </tr>
 
   <tr>
   <td>作者名：</td>
   <td><input type="text" name="wname" id="wname"></td>
   </tr>
    <tr>
     <tr>
   <td>出版社名称：</td>
   <td><input type="text" name="bhome" id="bhome"></td>
   </tr>
    <tr>
     <tr>
   <td>可借阅数量：</td>
   <td><input type="text" name="num" id="num"></td>
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