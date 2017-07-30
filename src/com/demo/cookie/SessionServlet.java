package com.demo.cookie;

import org.omg.CORBA.Object;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

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
       if(book!=null){
           resp.getWriter().print(book);
       }
        session.setAttribute("book","红楼梦");

    }
}
