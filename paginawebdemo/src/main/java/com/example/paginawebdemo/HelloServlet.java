package com.example.paginawebdemo;
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String message2;

    public void init() {
        message = "Segunda página";
        init2();
    }
    public void init2(){
        message2 = "Prueba";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h3>" + message2 + "</h3");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}