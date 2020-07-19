package com.sda;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AboutMeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

                writer.println("<p>Hello, World</p>"); //tu można pisać cały html - wiele linijek
    }
}
