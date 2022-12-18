package com.tms;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

public class CarsServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {
        System.out.println("-------- DO GET --------");
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Hello my first servlet!!!");
        outputStream.close();



    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("-------- DO INIT --------");
        super.init(config);
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }
}
