package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 重定向
* */

@WebServlet("/ServletResponse1")
public class ServletResponse1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("demo1.....");
        // 访问 /ServletResponse1 会自动跳转到 /ServletResponse2
        /*
        // 设置状态码为 302
        response.setStatus(302);
        // 设置响应头
        response.setHeader("location", "/ServletResponse2");
        */

        // 对重定向的封装方法
        response.sendRedirect("/ServletResponse2");
//        response.sendRedirect("http://www.google.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
