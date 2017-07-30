package com.demo.cookie;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet接口和GenericServlet是不特定于任何协议的
 * Created by ange on 2017/3/12.
 */
public class MGenericServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletContext: "+getServletContext());
        System.out.println("ServletName: "+getServletName());
        System.out.println("ServletConfig: "+getServletConfig());
        System.out.println("InitParameter:"+getInitParameter("author"));
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("Servlet可以获取到的一些基本信息"+"<br/>");
        printWriter.println("ServletContext: "+getServletContext()+"<br/>");
        printWriter.println("ServletName: "+getServletName()+"<br/>");
        printWriter.println("ServletConfig: "+getServletConfig()+"<br/>");
        printWriter.println("InitParameter:"+getInitParameter("author")+"这个参数可以在web.xml里配置"+"<br/>");
    }
}
