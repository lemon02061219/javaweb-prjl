<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2021/9/18
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>�û���¼ҳ��</title>
</head>
<body>
<form action="LoginControllerServlet" method="post" onsubmit="return check()">
    <table>
        <tr>
            <td>�������û�����</td>
            <td><input name="username" id="username" type="text"></td>
        </tr>
        <tr>
            <td>���������룺</td>
            <td><input name="password" id="password" type="password"></td>
        </tr>
        <tr>
            <select id="type" name="type">
                <option value="1">����Ա</option>
                <option value="2">��ͨ�û�</option>
            </select>
        </tr>
        <tr>
            <td><input type="submit" value="��¼"></td>
            <td><a href="register.jsp">ע��</a></td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
    function check(){
        var username = document.getElementById("username");
        var password = document.getElementById("password");
        if(username.value.length>6){
            alert("�û������ó���6λ");
            return false;
        }
        else if(password.value.length>6){
            alert("���벻�ó���6λ");
            return false;
        }
        else if(username.value==""){
            alert("�û�������Ϊ��");
            return false;
        }
        else if(password.value==""){
            alert("���벻��Ϊ��");
            return false;
        }
        else return true;
    }
</script>
</html>

