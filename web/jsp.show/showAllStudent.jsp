<%--
  Created by IntelliJ IDEA.
  User: xiaosheng
  Date: 2016/12/25
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showAllStudent</title>
    <script src="../js/jquery.js"></script>
    <script>
        $(function () {
            init();
        });

        function init() {
            $.ajax({
                type: 'post',
                dataType: 'json',
                url: 'studentAction_findAll',
                success: function (data) {
                    var html = "<tr>";
                    $.each(data, function () {
                        html = html +
                            "<td style='width: 100px'>" + this[0] + "</td>" +
                            "<td style='width: 100px'>" + this[1] + "</td>" +
                            "<td style='width: 100px'>" + this[2] + "</td>" +
                            "<td style='width: 100px'>" + this[3] + "</td>" +
                            "<td style='width: 100px'>" + this[4] + "</td>" +
                            "<td style='width: 100px'>" + this[5] + "</td>" +
                            "<td style='width: 100px'>" + this[6] + "</td>" +
                            "<td style='width: 100px'><input type='button' name='" + this[7] + "' value='修改'/><input type='button'name='" + this[7] + "' value='删除' onclick='del(this)'/></td>" +
                            "</tr>";
                    });
                    $("#studentShow").html(html);
                }
            });
        }

        function del(data) {
            if (confirm("确认删除")) {
                $.ajax({
                    type: 'post',
                    dataType: 'json',
                    url: 'studentAction_deleteStudent',
                    data: {'student.sid': data.name},
                    success: function (data) {
                        alert("删除成功");
                        init();
                    }
                });
            } else {
                alert("取消删除");
            }
        }
    </script>
</head>
<body>
<h3 align="right"><a href="home.jsp">返回主页</a></h3>
<div align="center">
    <table align="center">
        <tr>
            <td style="width: 100px">姓名</td>
            <td style="width: 100px">年龄</td>
            <td style="width: 100px">分数</td>
            <td style="width: 100px">备注</td>
            <td style="width: 100px">学号</td>
            <td style="width: 100px">班级</td>
            <td style="width: 100px">年级</td>
            <td style="width: 100px">操作</td>
        </tr>
    </table>
    <table id="studentShow" align="center"></table>
</div>
<hr>
<h3 align="center"><a href="home.jsp">返回主页</a></h3>
</body>
</html>
