package com.tms;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

public class CarsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Hello my first servlet");
        outputStream.close();

    }
}
