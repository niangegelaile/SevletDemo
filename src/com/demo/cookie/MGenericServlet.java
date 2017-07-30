package com.demo.cookie;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by ange on 2017/3/12.
 */
public class MGenericServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletContext: "+getServletContext());
        System.out.println("ServletName: "+getServletName());
        System.out.println("ServletConfig: "+getServletConfig());
        System.out.println("InitParameter:"+getInitParameter("author"));
    }
}
