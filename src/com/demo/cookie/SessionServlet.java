package com.demo.cookie;

import org.omg.CORBA.Object;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ange on 2017/3/14.
 */
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session= req.getSession();
        String sessionId=session.getId();
        Cookie cookie=new Cookie("JSESSIONID",sessionId);
        cookie.setMaxAge(30*60);
        resp.addCookie(cookie);
       String book= (String) session.getAttribute("book");
        PrintWriter printWriter=resp.getWriter();
        printWriter.print("session(会话)关闭浏览器，就结束，<br/>session存储在服务器,session可以保存信息，<br/>但可以使用cookie存储JSESSIONID，下次访问时，服务器可以通过JSESSIONID，找回session<br/>");
       if(book!=null){
           printWriter.print(book);
       }
        session.setAttribute("book","红楼梦");

    }
}
