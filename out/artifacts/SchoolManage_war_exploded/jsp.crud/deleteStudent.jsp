<%--
  Created by IntelliJ IDEA.
  User: xiaosheng
  Date: 2016/12/24
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deleteStudent</title>
</head>
<body>
<div align="center">
    <table>
        <s:form action="studentAction_deleteStudent">
            <tr>
                <td>学号:</td>
                <td><s:textfield name="student.studentId"/></td>
                <td id="studentId"></td>
            </tr>
            <tr>
                <td>姓名:</td>
                <td><s:textfield name="student.name"/></td>
                <td id="name"></td>
            </tr>
            <tr>
                <td>班级:</td>
                <td><s:select list="{1,2}" name="classId"/> </td>
            </tr>
            <tr>
                <td><s:submit/></td>
                <td><s:reset/></td>
            </tr>
        </s:form>
    </table>
</div>
</body>
</html>
