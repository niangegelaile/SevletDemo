<%--
  Created by IntelliJ IDEA.
  User: ange
  Date: 2017/3/12
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java"   %>
<html>
  <head>
    <title>页面导航</title>
  </head>

  <style>

    #clear{
      clear: both;
    }
    
    #ange{
      position: relative;
      text-align: center;
      background-image: url("http://p4.qhimg.com/dmfd/__90/t01de70134cb394467b.png?size=520x292");
      width: 600px;
      height: 400px;
    }






    a{
      background-color :white;
    }
   a:hover{
      background-color: red;
      cursor:hand;
    }





    #aa{
      margin-top: 20px;
      width: 20%;
      height: 100px;
      border-width: 1px;
      border-color: red;
      text-decoration-color: red;
    }




  </style>

  <body>
      <div >
        当前时间是：
          <%
            Date date=new Date();
            String time=date.toLocaleString();
            out.write(time);
          %>
      </div>
      <div>
        <a href="/mservlet">Servlet的生命周期</a><br/>
        <a href="/mGenericServlet">GenericServlet</a><br/>
        <a href="/cookie">cookie记录上次登录时间</a><br/>
        <a href="/bookShopServlet">cookie书店例子</a><br/>
        <a href="/sessionServlet">session</a><br/>
      </div>

    <%--<div id="ange">--%>
      <%--<% for(int i=0;i<5;i++){%>--%>
      <%--<h1 id="angeTest">你安哥哥来了</h1>--%>
      <%--<% }%>--%>
    <%--</div>--%>

    <%--<div id="aa">--%>
      <%--<%--%>
        <%--request.setAttribute("data","lalala");--%>
        <%--String data=(String)pageContext.getAttribute("data",PageContext.REQUEST_SCOPE);--%>
        <%--out.write(data);--%>
        <%--String data1=(String)pageContext.findAttribute("data");--%>
        <%--out.write(data1);--%>
      <%--%>--%>
    <%--</div>--%>



  </body>
</html>
