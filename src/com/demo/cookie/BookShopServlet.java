package com.demo.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ange on 2017/3/12.
 */
public class BookShopServlet extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter=resp.getWriter();
        printWriter.print("本店商品：</br>");
       Map<String,Book> books= Db.getBooks();
        for(Map.Entry<String,Book> entry:books.entrySet()){
            printWriter.print("<a href=\"/chooseBookServlet?id="+entry.getValue().getId()+"\" >"+entry.getValue().getName()+"</a></br>");
        }
        printWriter.print("你看过的商品：</br>");
        Cookie[] cookies= req.getCookies();
        for(int i=0;cookies!=null&&i<cookies.length;i++){
            if("bookHistory".equals(cookies[i].getName())){
                printWriter.print("cookie"+"  "+"bookHistory=");
                printWriter.print(cookies[i].getValue()+"</br>");
                String history=cookies[i].getValue();
                if(history.startsWith(",")){
                    history= history.replaceFirst(",","");
                }
                String[] keys=history.split(",");


                for(String k:keys){
                    if(!"".equals(k)) {
                        printWriter.print(books.get(k).getName() + "</br>");
                    }
                }

            }
        }
        printWriter.print("<a href=\"/clearBooks\" >"+"清空"+"</a></br>");


    }

    static class Book{
        private int id;

        private String name;

        public Book(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Book() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class  Db{
        private static Map<String ,Book> books=new LinkedHashMap<>();
        static {
            books.put("1",new Book(1,"java开发"));
            books.put("2",new Book(2,"android开发"));
            books.put("3",new Book(3,"ios开发"));
        }

        public static Map<String ,Book> getBooks(){

            return books;

        }



    }






}
