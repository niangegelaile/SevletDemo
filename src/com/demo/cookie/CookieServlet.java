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
        out.print("你上次登录的时间是：");
        Cookie[] cookies= req.getCookies();
        for(int i=0;cookies!=null&&i<cookies.length;i++){
            if("lastAccessTime".equals(cookies[i].getName())){
                out.print(new Date(Long.parseLong(cookies[i].getValue())).toLocaleString());
            }
        }
        Cookie cookie=new Cookie("lastAccessTime",String.valueOf(System.currentTimeMillis()));
        cookie.setMaxAge(30*24*60*60);
//        cookie.setPath("/demo");
        resp.addCookie(cookie);
    }
}
