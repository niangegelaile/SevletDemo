<%--
  Created by IntelliJ IDEA.
  User: ange
  Date: 2017/4/1
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="base.css"/>
</head>


    <body>
        <div class="title">
            <div class="title_left">
                <span>登录页面</span>
            </div>

            <div class="title_center"></div>
            <div class="title_right"></div>
        </div>
        <div class="title_bottom"></div>
        <div class="content">
            <div class="login_pan">
                <form >
                    <table border="0" class="center">
                        <tr>
                            <td>账号：</td>
                            <td>
                                <input type="text" maxlength="6"/>
                            </td>
                        </tr>
                        <tr>
                            <td>密码：</td>
                            <td>
                                <input type="password" maxlength="6"/>
                            </td>
                        </tr>
                        <tr ><td colspan="2" style="text-align: right"><input type="submit"value="登录"/></td></tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="bottom">
            <span>这里居中采用dispaly:table</span>
        </div>
</body>
</html>
