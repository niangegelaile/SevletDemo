package com.demo.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ange on 2017/3/12.
 */
public class ChooseBookServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies=req.getCookies();
        String cookieValue=null;
        for(int i=0;cookies!=null&&i<cookies.length;i++){
            if("bookHistory".equals(cookies[i].getName())){
                cookieValue=cookies[i].getValue();
            }
        }
        String newValue="";
        String id=req.getParameter("id");
        if(cookieValue==null||"".equals(cookieValue)){
            newValue=id;
        }else {
            if(!cookieValue.contains(id)){
                newValue=cookieValue+","+id;
            }else {
                newValue=cookieValue;
            }
        }
        Cookie cookie=   new Cookie("bookHistory",newValue);
        cookie.setMaxAge(30*24*3600);
        resp.addCookie(cookie);
        resp.sendRedirect("/bookShopServlet");
    }
}
