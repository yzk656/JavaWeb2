package com.yzk.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 实现 Servlet
 * 1. 创建普通java类
 * 2. 实现Servlet规范，继承 httpServlet类
 * 3. 重写 Service 方法，用来处理处理请求
 * 4. 设置注解，指定访问路径
 */
//@WebServlet(name="Servlet01",value = "ser01")
    /**
     * value 是访问路径
     * 路径中的斜杠不要忘记写
     * */
//@WebServlet(name="Servlet01",value = {"/ser01","/ser001"})
//@WebServlet(name="Servlet01",urlPatterns = {"/ser01","/ser001"})
@WebServlet("/ser01")
public class servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*打印内容*/
        System.out.println("hello Servlet！");
        /*通过流输出数据到浏览器*/
        resp.getWriter().write("hello Servlet！");
    }
}
