<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2021/9/18
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册普通用户</title>
</head>
<body>
<form action="RegisterServlet" method="post" onsubmit="return check()">
    <table>
        <tr>

            <td><input name="username" id="username" type="text"></td>
        </tr>
        <tr>
            <td>请输入密码：</td>
            <td><input name="password" id="password" type="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
            <td><a href="login.jsp">登录</a></td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    function check(){
        var username = document.getElementById("username");
        var password = document.getElementById("password");
        if(username.value.length>6){
            alert("用户名不得超过6位");
            return false;
        }
        else if(password.value.length>6){
            alert("密码不得超过6位");
            return false;
        }
        else if(username.value==""){
            alert("用户名不得为空");
            return false;
        }
        else if(password.value==""){
            alert("密码不得为空");
            return false;
        }
        else return true;
    }
</script>
</body>
</html>
