package com.demo.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * cookie保存上一次的登录时间
 * Created by ange on 2017/3/12.
 */
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.print("cookie保存在浏览器本地，每次请求把cookie带到服务器"+"<br/>");
        out.print("你上次登录的时间是：");
        Cookie[] cookies= req.getCookies();//从请求里获取cookies,如果存有对应name的cookie则输出，否则存入
        boolean have=false;
        for(int i=0;cookies!=null&&i<cookies.length;i++){
            if("lastAccessTime".equals(cookies[i].getName())){
                have=true;
                out.print(new Date(Long.parseLong(cookies[i].getValue())).toLocaleString());
            }
        }
        Cookie cookie=new Cookie("lastAccessTime",String.valueOf(System.currentTimeMillis()));
        cookie.setMaxAge(30*24*60*60);
        if(!have){
            out.print("第一次进入本页面，时间为："+new Date(Long.parseLong(cookie.getValue())).toLocaleString());
        }
//        cookie.setPath("/demo");
        resp.addCookie(cookie);
    }
}
