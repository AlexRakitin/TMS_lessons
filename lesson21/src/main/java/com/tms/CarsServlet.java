package com.tms;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

public class CarsServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("-------- DO INIT --------");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("-------- DO SERVICE --------");
        super.service(req, res);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {
        System.out.println("-------- DO GET --------");
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Hello my first servlet!!!");
        outputStream.close();
    }
}
