<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <%-- http://localhost:8888/emp/findAll --%>
    <%-- http://localhost:8888/css/bootstrap.css --%>
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">--%>
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>

   <div class="container">
       <table border="1px" class="table table-hover">
           <tr>
               <td>员工编号</td>
               <td>员工名称</td>
               <td>员工职位</td>
               <td>员工领导编号</td>
               <td>入职日期</td>
               <td>部门编号</td>
               <td> <a href="">修改</a> <a href="">删除</a> </td>
           </tr>

           <c:forEach items="${emps}" var="emp">
               <tr>
                   <td>${emp.empno}</td>
                   <td>${emp.ename}</td>
                   <td>${emp.job}</td>
                   <td>${emp.mgr}</td>
                   <td> <fmt:formatDate value="${emp.hiredate}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> </td>
                   <td>${emp.deptno}</td>
                   <td> <a href="">修改</a> <a href="">删除</a> </td>
               </tr>
           </c:forEach>
       </table>

   </div>

</body>
</html>
