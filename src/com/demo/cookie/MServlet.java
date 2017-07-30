package com.demo.cookie;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet生命周期，Servlet接口和GenericServlet是不特定于任何协议的
 * Created by ange on 2017/3/12.
 */
public class MServlet implements Servlet {
    /**
     * 1，初始化阶段,
     * 在Servlet的整个生命周期内，
     * init()方法只被调用一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 　2，响应客户请求阶段,
     * service()方法中对请求的方式进行了匹配，
     * 选择调用doGet,doPost等这些方法，
     * 然后再进入对应的方法中调用逻辑层的方法，
     * 实现对客户的响应。
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter out=servletResponse.getWriter();
        out.print("servlet 的生命周期<br/>");
        out.print("init :初始化阶段<br/>");
        out.print("service :响应客户请求阶段<br/>");
        out.print("destroy :终止阶段<br/>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 3，终止阶段
     */
    @Override
    public void destroy() {
        System.out.println("destroy");
    }



}
