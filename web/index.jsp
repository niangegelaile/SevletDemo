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
                                <input id ="account" type="text" maxlength="6"/>
                            </td>
                        </tr>
                        <tr>
                            <td>密码：</td>
                            <td>
                                <input id ="password" type="password" maxlength="6"/>
                            </td>
                        </tr>
                        <tr ><td colspan="2" style="text-align: right"><input id="but_login" type="button"value="登录"/></td></tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="bottom">
            <span>这里居中采用dispaly:table</span>
        </div>
        <script language="JavaScript">
            var but_login=document.querySelector("#but_login");
            but_login.onclick=function () {
                var et_account=document.querySelector("#account");
                var et_password=document.querySelector("#password")
                console.log(et_account.value);
                if(et_account.value=='1'&&et_password.value=='1'){
                    console.log("点击了！")
//                   window.open("nav.jsp");//新开窗口
                    window.location.href="nav.jsp";
                }

            }
        </script>
</body>

</html>
